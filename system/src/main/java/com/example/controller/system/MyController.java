package com.example.controller.system;


import com.example.model.services.system.*;
import com.pojos.system.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("system/")
public class MyController {
//    部门
    @Autowired
BuMenservice buMenservers;
//     员工
    @Autowired
YuanGoservice yuanGoservice;
//    科室
    @Autowired
KeShiservive keShiservive;
//    岗位
    @Autowired
GangWeiservice gangWeiservers;
//    用户
    @Autowired
YongHuservice yongHuservice;
//   权限
    @Autowired
    QuanXianservice quanXianservice;
//    班次
    @Autowired
    BanCiService banCiService;
//    班次类型
    @Autowired
    BanCiTypeService banCiTypeService;
//    排班表
    @Autowired
    PaiBanService paiBanService;



    //    ====================================员工管理======================================
    //         获取员工数据
    @PostMapping("getyg")
    public List<YuanGo> getYg(){
        return yuanGoservice.getYuanGo();
    }
//    查询员工全部数据
    @RequestMapping("/getygall")
    public List<YuanGo> getyg2(String param){
        List<YuanGo> yuanGoAll = yuanGoservice.getYuanGoAll(param);
        return yuanGoAll;
    }
//    新增员工
    @PostMapping("xzyg")
    public int xz(@RequestBody YuanGo yuanGo){
        return yuanGoservice.insertyg(yuanGo);
    }
//   修改员工
    @PostMapping("xgyg")
    public int xg(@RequestBody YuanGo yuanGo){
        return yuanGoservice.updateyg(yuanGo);
    }
//    根据员工科室分职位查询员工
    @GetMapping("ksygs/{ksId}")
    public List<GangWei> getksyg(@PathVariable("ksId") String ksId){
        return yuanGoservice.getGwdYg(ksId);
    }
//  登录用接口
    @GetMapping("user/info")
    public CommonResult getyg3(String token){
        //返回的用户信息
        YuanGo yuanGo = yuanGoservice.getyg3(token);
        return new CommonResult(200,null,yuanGo);
    }

//    ====================================部门管理======================================
//      新增部门
    @PostMapping("insertBm")
    public int insertyg(@RequestBody BuMen buMen){
        return buMenservers.insert(buMen);
    }
//      修改部门
    @PostMapping("updatebm")
    public int updateByPrimaryKeySelective(@RequestBody BuMen buMen){
        return buMenservers.updateByPrimaryKeySelective(buMen);
    }
    //      获取部门数据
    @GetMapping("/getbumen/{shou}")
    public List<BuMen> getbm(@PathVariable("shou") String shou){
        return buMenservers.getbm(shou);
    }


//    ====================================科室管理======================================
//    查询科室
    @PostMapping("selectks")
    public List<KeShi> getks(){
        return keShiservive.getks();
    }
//    查询科室全部数据，包括员工
    @GetMapping("keshiall/{shou}")
    public List<KeShi> ks(@PathVariable("shou") String shou){
        return keShiservive.getall(shou);
    }
//  新增科室
    @PostMapping("xzks")
    public int ksxz(@RequestBody KeShi keShi){
        return keShiservive.insertks(keShi);
    }
    //  修改科室
    @PostMapping("xgks")
    public int ksxg(@RequestBody KeShi keShi){
        return keShiservive.updateks(keShi);
    }


//    ============================岗位管理===================================
    /**
     * 查询岗位
     */
    @PostMapping("selectgw")
    public List<GangWei> getgw(String param){
        return gangWeiservers.getgw(param);
    }
    /**
     * 分层查询岗位
     */
    @PostMapping("gwfc")
    public List<GangWei> gwfc(){
        return gangWeiservers.getfcgw();
    }
    /**
     * 新增岗位和岗位对应的权限
     * @param gangWei
     */
    @PostMapping("xzgw")
    public void xzgw(@RequestBody GangWei gangWei){
        gangWeiservers.insertgw(gangWei);
    }

    /**
     * 修改岗位
     * @param gangWei
     * @return
     */
    @PostMapping("xggw")
    public CommonResult xggw2(@RequestBody GangWei gangWei){
        gangWeiservers.updateGw(gangWei);
//      返回一个类
        return new CommonResult(200,"修改成功");
    }


//    ====================用户管理=========================
//  新增用户
    @PostMapping("xzyh")
    public int ins(@RequestBody YongHu yongHu){
        return yongHuservice.insertyh(yongHu);
    }
//    重置密码用户
    @PostMapping("czmm")
    public int xgy(@RequestBody YongHu yongHu){
        return yongHuservice.czmm(yongHu);
    }
//  用户修改密码
    @PostMapping("xgmm")
    public CommonResult xgmm(@RequestBody YongHu yongHu){
        if (yongHuservice.xgmm(yongHu)==1){
            return new CommonResult(200,"密码修改成功！");
        }
        return new CommonResult(300,"原密码错误！");
    }
//    删除用户
    @PostMapping("scyh")
    public int sc(@RequestBody YongHu yongHu){
        return yongHuservice.deleteyh(yongHu.getYhId()+"");
    }
//  用户登录
    @PostMapping("user/login")
    public CommonResult dl(@RequestBody YongHu yongHu){
        YuanGo yuanGo = yongHuservice.getyh(yongHu);
        if(yuanGo!=null){
            return new CommonResult(200,"登录成功",yuanGo);
        }
        return new CommonResult(300,"账户或密码错误",yuanGo);
    }
    //    ------------------------查询权限-----------------------------
    @PostMapping("cxqx")
    public List<QuanXian> getqx(){
        return quanXianservice.getqx();
    }

    /**
     * 获取当前登录人拥有的路由
     * @param gwId
     * @return
     */
    @GetMapping("/user/router/{gwId}")
    public CommonResult<List> getGwlogout(@PathVariable("gwId") String gwId){
        System.err.println(gwId);
        CommonResult<List> commonResult=new CommonResult<>();
        commonResult.setCode(200).setMessage("获取动态路由成功").setData(quanXianservice.router(gwId));
        return commonResult;
    };

//===================班次表==========================

    /**
     * 班次
     * @param bcType
     * @return
     */
    @GetMapping("cxbc/{bcType}")
    public List<BanCi> getbc(@PathVariable("bcType") String bcType){
        CommonResult<List> listCommonResult = new CommonResult<>();
        listCommonResult.setData(banCiService.getbc(bcType))
                .setCode(200).setMessage("访问成功！");
        return listCommonResult.getData();
    }
//    =====================班次类型表===================
    @GetMapping("bctype")
    public List<BanCiType> getBcType(){
        return banCiTypeService.getBcType();
    }

//==================排班表=======================

    /**
     * 获取排班的数据
     * @return
     */
    @GetMapping("hqpb/{ksId}/{xq}")
    public List<PaiBan2> getpb(@PathVariable("ksId") String ksId,@PathVariable("xq") Integer xq){
        System.err.println(8051);
        return paiBanService.getPb(ksId,xq);
    }
    /**
     * 新增员工排班的方法
     */
    @PostMapping("xzpb")
    public CommonResult xzpb2(@RequestBody PaiBan3 paiBan3){
        paiBanService.insertpb(paiBan3);
        return new CommonResult(200,"新增成功");
    }

    /**
     * 根据时间 科室 职位 查排班的员工
     * @return
     */
    @GetMapping("pbyg")
    public List<YuanGo> getpbyg(String ksId,String gwId,String rq,int typeId,int bmId){
        return paiBanService.getpbyg(ksId,gwId,rq,typeId,bmId);
    }


    /**
     * redis测试的
     * @return
     */
    @GetMapping("abcd")
    public Object abcdddd(){
        System.err.println("12345678");
        return keShiservive.dddd();
    }




}
