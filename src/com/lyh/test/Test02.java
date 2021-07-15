package com.lyh.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //定义当前日期
        Date data = new Date();
        //修改日期显示的格式
        String parrern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(parrern);
        String chinaDateStr = sdf.format(data);
        System.out.println("chinaDateStr = " + chinaDateStr);
    }
}
