package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.KuCunFayaoService;
import com.pojos.pharmacy.ChuKu;
import com.pojos.pharmacy.DiaoBoSq;
import com.pojos.pharmacy.XiaoHuiSq;
import com.pojos.pharmacy.YpKuCun;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pharmacy/")
public class KuCunFayaoController {
    @Autowired
    KuCunFayaoService kuCunFayaoService;
    @RequestMapping("kucun")
    public List<YpKuCun> FindAllKuCun(){
        return kuCunFayaoService.FindAllKuCun();
    }
    @RequestMapping("kucun3")
    public List<YpKuCun> FindAllKuCun3(){
        return kuCunFayaoService.FindAllKuCun3();
    }
    @RequestMapping("add-dbd")
    public String addYPDB(@RequestBody DiaoBoSq diaoBoSq){
        try {
            kuCunFayaoService.addYPDB(diaoBoSq);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("add-xhd")
    public String addXHSQ(@RequestBody XiaoHuiSq xiaoHuiSq){
        try {
            kuCunFayaoService.addXHSQ(xiaoHuiSq);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("ypsq1")
    public List<DiaoBoSq> findByYPSQ1(){
        return kuCunFayaoService.findByYPSQ1();
    }
    @RequestMapping("ypsq2")
    public List<DiaoBoSq> findByYPSQ2(){
        return kuCunFayaoService.findByYPSQ2();
    }

    @RequestMapping("editsqd")
    public void updateYPSQ(int sqZhuangTai,String dbShengQing){
        kuCunFayaoService.updateYPSQ(sqZhuangTai,dbShengQing);
    }

    @RequestMapping("dbck")
    public String addChuKu(@RequestBody ChuKu chuKu){
        try {
            return kuCunFayaoService.addDBChuKu(chuKu);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }
}
