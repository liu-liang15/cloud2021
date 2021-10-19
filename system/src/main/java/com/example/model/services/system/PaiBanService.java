package com.example.model.services.system;

import com.example.model.dao.system.PaiBanMapper;
import com.pojos.system.PaiBan;
import com.pojos.system.PaiBan2;
import com.pojos.system.PaiBan3;
import com.pojos.system.YuanGo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 08月05日11:23
 * 排班service
 */
@Service
public class PaiBanService {
    @Resource
    PaiBanMapper paiBanMapper;
    //    Calendar.MONDAY返回的值是星期一的日期
    private static final int FIRST_DAY = Calendar.MONDAY;

    /**
     * 查询某周的排班数据
     * @return
     * @param ksId
     */
    public List<PaiBan2> getPb(String ksId, Integer xq){
        List<PaiBan2> ban2List=new ArrayList<>();

        //获取当前时间
        Calendar calendar = Calendar.getInstance();
        // 给这个星期加减日期
        calendar.add(Calendar.DAY_OF_MONTH,7*xq);
        //        调用方法回到本周的第一天
        setToFirstDay(calendar);
        for (int i = 0; i < 7; i++) {
            PaiBan2 paiBan2=new PaiBan2();
//           将星期，日期，赋值
            System.err.println(calendar);
            paiBan2 = printDay(calendar,paiBan2);
            //  查询这个科室的排班信息，并赋值
            List<PaiBan> panBan = paiBanMapper.getPanBan(paiBan2.getRq(),ksId);
            paiBan2.setPaiBanList(panBan);
            //  将查询出来的结果赋值给需要返回出去的集合
            ban2List.add(paiBan2);
            //System.out.println(rq);
//           循环给日期加天数
            calendar.add(Calendar.DATE, 1);
        }
        return ban2List;
    }
    /**
     *新增排班的方法
     */
    public int insertpb(PaiBan3 paiBan3){
        paiBanMapper.delectYgPb(paiBan3.getBc(),paiBan3.getRq());
        String[] yuanGoIds = paiBan3.getYuanGoIds();
        PaiBan paiBan=new PaiBan();
        for (String yuanGoId : yuanGoIds) {
            if (yuanGoId!=null){
                paiBan.setBcId(paiBan3.getBc())
                        .setYgId(yuanGoId)
                        .setRq2(paiBan3.getRq());
                paiBanMapper.insert(paiBan);
            }
        }
        return 0;
    }
    /**
     * 调用查询某一周的方法，默认当前一周
     */
    public static void printWeekdays() {


    }

    /**
     * 回到本周第一天
     * @param calendar
     */
    private static void setToFirstDay(Calendar calendar) {
//        获取本周的第一天
        while (calendar.get(Calendar.DAY_OF_WEEK) != FIRST_DAY) {
            calendar.add(Calendar.DATE, -1);
        }
    }

    /**
     * 将传进来的排班表赋值日期和星期
     * @param calendar
     * @param paiBan2
     * @return
     */
    private static PaiBan2 printDay(Calendar calendar,PaiBan2 paiBan2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EE");
        paiBan2.setXq(dateFormat2.format(calendar.getTime()));
        paiBan2.setRq(dateFormat.format(calendar.getTime()));
        return paiBan2;
    }

    /**
     * 根据时间 科室 职位 查排班的员工
     * @param ksId
     * @param gwId
     * @param rq
     * @return
     */
    public List<YuanGo> getpbyg(String ksId,String gwId,String rq){
        return paiBanMapper.getyg(ksId,gwId,rq);
    }

}
