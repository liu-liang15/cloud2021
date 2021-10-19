package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.YaoFangDao;

import com.example.model.dao.pharmacy.YfScatteredDao;
import com.pojos.pharmacy.FaYao;
import com.pojos.pharmacy.FaoYaoXd;
import com.pojos.pharmacy.Hibernate;
import com.pojos.pharmacy.YpYaoFang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Transactional
public class YaoFangService {
    @Autowired
    YaoFangDao yaoFangDao;
    @Autowired
    YfScatteredDao yfScatteredDao;
    public void faYao(FaYao faYao){
        List<FaoYaoXd> faoYaoXds= (List<FaoYaoXd>) faYao.getFaoYaoXds();
       //新增发药主表
        yaoFangDao.addFYD(faYao);
        //新增发药详表
        yaoFangDao.addFYXD(faYao.getFaoYaoXds(), faYao.getFyId());
        String fyyy= faYao.getFyYy();
        if( "门诊发药".equals(fyyy) ){
            //修改门诊缴费待代发药品的状态
            yaoFangDao.updateFYXD(faYao.getJfd());
            //修改药房药品数量
            for (int i=0;i<faoYaoXds.size();i++){
                yaoFangDao.reduceDrugNumber(faoYaoXds.get(i).getYpSl(),faoYaoXds.get(i).getYpId());
            }
            //查询某门诊缴费单内所有项目数量
            int sum1= yaoFangDao.sum1(faYao.getJfd());
            //查询某门诊缴费单内所有已完成的项目数量
            int sum2= yaoFangDao.sum2(faYao.getJfd());
            if (sum1==sum2){
                yaoFangDao.updateFYD(faYao.getJfd());
            }
        }else if("短期医嘱".equals(fyyy)){
            System.out.println(fyyy);
            yaoFangDao.changeDis(faYao.getFyRy(),faYao.getJfd());
            //修改药房药品数量
            for (int i=0;i<faoYaoXds.size();i++){
                yaoFangDao.reduceDrugNumber(faoYaoXds.get(i).getYpSl(),faoYaoXds.get(i).getYpId());
            }
        }else if ("长期医嘱".equals(fyyy)){
            yaoFangDao.changeDis(faYao.getFyRy(),faYao.getJfd());
            for (int i=0;i<faoYaoXds.size();i++){
                //当前循环的药品id
                int drugId=faoYaoXds.get(i).getYpId();
                //当前循环的药品应该发药的数量
                int drugNumber=faoYaoXds.get(i).getYpSl();
                //查询改药品是否有散装 结果1代表有,0代表没有
                int sum=yfScatteredDao.sum(drugId);
                //改药品的话每单位多少散装数,如阿莫西林胶囊散装为40粒
                int sum1= Integer.parseInt(getNumbers(yfScatteredDao.matr(drugId)));
                if(sum == 0){
                    //没有改药品散装记录就添加记录
                    //sum2是改药品散装后扣除该发药数量后的数量
                    int sum2=sum1-drugNumber;
                    //记录该散装记录
                    yfScatteredDao.addscattered(drugId,sum2);
                    //减少一盒改药品数量
                    yaoFangDao.reduceDrugNumber(1,drugId);
                }else{
                    //sum3为该药品散装剩余数量
                    int sum3=yfScatteredDao.scatteredSum(drugId);
                    //如果散装数够发药,扣除药品数量
                    if(sum3 >= drugNumber){
                        yfScatteredDao.editscattered2(faoYaoXds.get(i).getYpSl(),drugId);
                    }else {
                        //如果数量不够,新开一盒药品,添加散装数,减少药品库存,然后减少散装数量
                        yfScatteredDao.editscattered1(sum1,drugId);
                        yaoFangDao.reduceDrugNumber(1,drugId);
                        yfScatteredDao.editscattered2(faoYaoXds.get(i).getYpSl(),drugId);
                    }
                }
            }
        }
    }
    //截取数字
    public static String getNumbers(String str) {
        String str1 = str.substring(0, str.indexOf("*"));
        String str2 = str.substring(str1.length()+1, str.length());
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str2);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }
    //查询药房库存
    public List<YpYaoFang> findAll(){
        return yaoFangDao.findAllYFYP();
    }
    public List<FaYao> allFaYaoJiLu(Hibernate hibernate){
        return yaoFangDao.allFaYaoJiLu(hibernate);
    }

}
