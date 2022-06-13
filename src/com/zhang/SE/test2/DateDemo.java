package com.zhang.SE.test2;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-13 14:09
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class DateDemo {
    public static void main(String[] args) {
//        SimpleDateFormat ft = new SimpleDateFormat();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd"); // 按照固定的格式解析
        String s = args.length == 0 ? "1918-11-10" : args[0];
        System.out.println(s+ " parses as " );
        Date t;
        try {
            t = ft.parse(s);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("unparseable using "+ft);
        }
    }
    @Test
    public void s1(){
        int x =11;
        String ss = Integer.toString(x);
        String s = String.valueOf(x);
    }
    @Test
    public void s2(){
        System.out.println(new Date() + "\n");
        try {
            Thread.sleep(1000*3); // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (InterruptedException e) {
            System.out.println("Got an exception");
        }
    }

    @Test
    public void s3(){
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(3000);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long ends = end - start;
            System.out.println("最终的结果为： " + ends);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("中断异常");
        }
    }

    @Test
    public void s4(){
        try {
            // 将字符串格式的时间装换为系统格式【new SimpleDateFormat("yyyy-MM-dd")表示只接受这样的字符串格式】
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2019-5-21"); // Tue May 21 00:00:00 CST 2019
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
         // 将系统格式转化为文本格式【new SimpleDateFormat("yyyy-MM-dd")表示将时间转换为这个格式】
        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()); // 2022-03-17 13:56:24
        System.out.println(dateStr);

        // 将时间戳转换为时间
        long lt = 909072000000l;
        Date date = new Date(lt);
        System.out.println(date);
        // 获取当前时间的时间戳
        Date date1 = new Date();
        System.out.println(date1.getTime());
    }

    @Test
    public void s5(){
        // 第一种 将字符串的时间格式转换为系统格式
        String dateStr1 = "2022-5-21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(dateStr1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("时间"+ dateStr1+"的系统格式为： "+ date);
//        以上的代码简写为一句
//        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr1);


        // 第二种 将系统的时间格式转化为字符串
        Date currentTime = new Date();  // 获取当前时间
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String dateStr2 = sdf2.format(currentTime);
        System.out.println("当前的时间为: "+ dateStr2);
        // 以上的代码可简写为：
//        String dateStr2 =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentTime);
    }

    @Test
    public void s6(){
        long s = 1498838400000l;
        Date date = new Date(s);
        System.out.println(date);
    }
}
