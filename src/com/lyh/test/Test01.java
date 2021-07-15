package com.lyh.test;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //定义当前时间
        Date date = new Date();
        System.out.println("date = " + date);
        //获得当前时间的long值
        long time = date.getTime();
        //三天后这一刻的时间
        time += 1000*60*60*24*3L;
        date.setTime(time);
        System.out.println("date = " + date);
    }
}
