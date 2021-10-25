package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.KuCunFayaoDao;
import com.example.model.dao.pharmacy.XiaoHuiDao;
import com.example.model.dao.pharmacy.YaoFangDao;
import com.pojos.pharmacy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KuCunFayaoService {
    @Autowired
    KuCunFayaoDao kuCunFayaoDao;
    @Autowired
    XiaoHuiDao xiaoHuiDao;
    @Autowired
    YaoFangDao yaoFangDao;
    public List<YpKuCun> FindAllKuCun(){
        return kuCunFayaoDao.FindAllKuCun();
    }
    public List<YpKuCun> FindAllKuCun3(){
        return kuCunFayaoDao.FindAllKuCun3();
    }

    public void addYPDB(DiaoBoSq diaoBoSq){
        kuCunFayaoDao.addDBSQ(diaoBoSq);
        kuCunFayaoDao.addDBXD(diaoBoSq.getDbsqXiangBiaos(),diaoBoSq.getDbShengQing());
    }

    public void addXHSQ(XiaoHuiSq xiaoHuiSq){
        kuCunFayaoDao.addXHSQ(xiaoHuiSq);
        kuCunFayaoDao.addXHXB(xiaoHuiSq.getXiaoHuiXds(),xiaoHuiSq.getXhsqId());
    }

    public List<DiaoBoSq> findByYPSQ1(){
        return kuCunFayaoDao.findByYPSQ1();
    }

    public List<DiaoBoSq> findByYPSQ2(){
        return kuCunFayaoDao.findByYPSQ2();
    }

    public void updateYPSQ(int sqZhuangTai,String dbShengQing){
        kuCunFayaoDao.updateYPSQ(sqZhuangTai,dbShengQing);
    }

    public String addDBChuKu(ChuKu chuKu){
        //updateYPSQ(chuKu.getZt(), chuKu.getXhsqId());
        xiaoHuiDao.addCK(chuKu);
        //获取要调拨的药品编号和调拨数量
        List<Interim> interims= chuKu.getInterims();
        //开始循环减库存
        for (int i=0;i<interims.size();i++){
            //根据药品编号获取该库存的库存,时间倒序查询,优先减少保质时间最少的
            int drugId= Integer.parseInt(interims.get(i).getDrugId());
            int drugnumber=interims.get(i).getDrugNumber();
            int drugSum= kuCunFayaoDao.findSum(drugId);
            if(drugSum >= drugnumber){
                //修改药房药品的数量
                //循环减某一药品库存
                if (drugnumber>0) {
                    List<YpKuCun> kuCuns= kuCunFayaoDao.FindAllKuCun2(drugId);
                    yaoFangDao.addDrugNumber(drugId,drugnumber);
                    int sum3=drugnumber;
                    for (int y=0;y<kuCuns.size();y++){
                        String rcpcId=kuCuns.get(y).getRkpcId()+' ';
                        //药品调拨的数量
                        //药品库存查询所得的集合第y下标的库存
                        System.out.println("进入循环");
                        int sum2= (int) kuCuns.get(y).getYpsl();
                        //调拨数量大于库存数量进入if,否则进入else
                        if(sum2 - Math.abs(sum3) > 0){//第一次进循环
                            //新增发药详情记录
                            kuCunFayaoDao.addFaYaoXQ(chuKu.getChukuId(),rcpcId,Math.abs(sum3));
                            //修改库存记录,减少对应库存
                            kuCunFayaoDao.edatKcCun(Math.abs(sum3),kuCuns.get(y).getRkpcId());
                        }else{
                            kuCunFayaoDao.addFaYaoXQ(chuKu.getChukuId(),rcpcId,sum2);
                            //定义数值,获取剩余待调拨数量
                            sum3 = sum2 - Math.abs(sum3);
                            //删除库存记录
                            xiaoHuiDao.deltetKucun(Integer.valueOf(kuCuns.get(y).getRkpcId()));
                        }
                    }
                    //删除库存数量为0的所有库存信息,应对调拨数真好对应某一库存数量时未删除库存记录
                    kuCunFayaoDao.delectKuCun();
                }
                return "ok";
            }else {
                return "no";
            }
        }

        return null;
    }
}
