package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.XiaoHuiService;
import com.pojos.pharmacy.ChuKu;
import com.pojos.pharmacy.XiaoHuiSq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("pharmacy/")
public class XiaoHuiController {
    @Autowired
    XiaoHuiService xiaoHuiService;
    @RequestMapping("xhd")
    public List<XiaoHuiSq> findAllXHD(Integer sq){
        return xiaoHuiService.findAllXHD(sq);
    }
    @RequestMapping("editxdh")
    public void editxhd(Integer zt,String xhsqId){
        xiaoHuiService.editxhd(zt,xhsqId);
    }
    @RequestMapping("xhck")
    public String addXHCK(@RequestBody ChuKu chuKu){
        try {
            xiaoHuiService.XHChuKu(chuKu);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

}
