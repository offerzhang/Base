package com.zhang.SE.test2;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-09 23:36
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDate {
    @Test
    public void s1(){
        /**创建时间的两种构造方法：
         *     - Date()
         *     - Date(long millisec)
         */
        System.out.println(new Date());
        System.out.println(new Date().toString());
        System.out.println(new Date().getTime());  // 获得到现在为止的毫秒数
        System.out.println(new Date(new Date().getTime()));
    }

    @Test
    public void s2(){
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat();
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前的时间为："+ sf.format(date));
        System.out.println(sf1.format(date));

        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd hh:mm:SS");  // 也不会报错，只是丑了一点，秒数有误不准确哇【毫秒数】
        System.out.println("==========");
        System.out.println(ss.format(date));
    }
}
