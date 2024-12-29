package com.lq.date;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Author: Grace
 * @Date: 2024/12/28 21:47
 * @Description: TODO
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(0L);

        System.out.println("date1:" + date1);
        System.out.println("date2:" + date2);

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间：" + ft.format(date1));

        Date date3 = new Date(System.currentTimeMillis());
        System.out.println("当前时间：" + ft.format(date3));

        // 返回时间戳
        System.out.println(date1.getTime());

        // ------------------------------------------------------------------------
        Calendar c1 = Calendar.getInstance();
//        c1.set(2024, 12 - 1, 28);

        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH));
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.MINUTE));
        System.out.println(c1.get(Calendar.SECOND));

        //

    }
}
