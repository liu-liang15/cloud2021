package com.example.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author 刘亮
 * @date 2021年 08月03日23:14
 */
public class DataUtil {
//    Calendar.MONDAY返回的值是星期一的日期
    private static final int FIRST_DAY = Calendar.MONDAY;

    /**
     * 调用查询某一周的方法，默认当前一周
     */
    public static void printWeekdays() {
        Calendar calendar = Calendar.getInstance();
//        调用方法回到本周的第一天
        setToFirstDay(calendar);
        for (int i = 0; i < 7; i++) {
//            调用格式化的方法
            printDay(calendar);
//           循环加7天
            calendar.add(Calendar.DATE, 1);
        }
    }

    private static void setToFirstDay(Calendar calendar) {
//        获取本周的第一天
        while (calendar.get(Calendar.DAY_OF_WEEK) != FIRST_DAY) {
            calendar.add(Calendar.DATE, -1);
        }
    }
    //        格式化
    private static void printDay(Calendar calendar) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd EE");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
