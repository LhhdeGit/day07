package com.lyh.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生产日期");
        String make = sc.nextLine();
        System.out.println("请输入保质期的天数");
        int n = sc.nextInt();
       if (make.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")) {
            Date date = sdf.parse(make);//字符串转日期
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            //给保质期添加天数
            calendar.add(calendar.DAY_OF_YEAR, n);
            //减去14天
            calendar.add(calendar.DAY_OF_YEAR, -14);
            //设定当前的日期
            calendar.set(calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
            date = calendar.getTime();   //获取当前周几
            System.out.println("促销日期是：" + sdf.format(date));
        }else{
           System.out.println("你输入的有误");
        }
    }
}