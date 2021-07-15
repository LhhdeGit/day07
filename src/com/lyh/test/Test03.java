package com.lyh.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 *
 */
public class Test03 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日，格式为 yyyy-MM-dd");
        String brithday = sc.nextLine();
        if (brithday.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")){  //正则表达式 d是数字 4是4位数  判断年月日
            Date briDate = null;
            try {
                briDate = sdf.parse(brithday);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date now = new Date(); //现在的时间
            long time = now.getTime()-briDate.getTime(); //当前时间-生日时间
            long day = time /1000/60/60/24;  //过去了多少毫秒
            long week=day/7;  //过去了几周
            long year=week/52;
            System.out.println("到现在为止经过了"+week+"周");
            System.out.println("到现在过去了"+year+"年");
        }else{
            System.out.println("你输入的有误");
        }
    }
}
