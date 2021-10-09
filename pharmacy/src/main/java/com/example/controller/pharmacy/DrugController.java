package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.DrugService;
import com.pojos.pharmacy.YaoPingGg;
import com.pojos.pharmacy.YaoPingLb;
import com.pojos.pharmacy.YaoPingLx;
import com.pojos.pharmacy.YaoPingXx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("pharmacy/")
public class DrugController {
    @Autowired
    DrugService drugService;

    @RequestMapping("spec")
    public   List<YaoPingGg> findAllSpec(){
        return drugService.findAllSpec();
    };
    @RequestMapping("sort")
    public  List<YaoPingLb> findAllSort(){
        return drugService.findAllSort();
    };
    @RequestMapping("type")
    public List<YaoPingLx> findAllType(){
        return drugService.findAllType();
    };
    @RequestMapping("drug")
    public  List<YaoPingXx> findAllDrug(@RequestBody YaoPingXx yaoPingXx){
        return drugService.findAllDrug(yaoPingXx);
    }
    //根据供应商修改药品状态
    @RequestMapping("update-drug")
    public String updateDrug(@RequestBody int supplyId){
        try {
            drugService.update(supplyId);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
    @RequestMapping("add-drug")
    public String addDrug(@RequestBody YaoPingXx yaoPingXx){
        try {
            if(yaoPingXx.getDrugId()==0){
                drugService.addDrug(yaoPingXx);
                return "ok1";
            }else{
                drugService.updateDrug(yaoPingXx);
                return "ok2";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }
}
