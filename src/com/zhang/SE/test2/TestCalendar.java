package com.zhang.SE.test2;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-15 10:45
 * To: 真常应物，真常得性，常清常静，常清静矣
 */

// 测试日历类
public class TestCalendar {
    @Test
    public void s1(){
        // 创建一个代表当前日期的Calendar对象
        // 创建的过程是透明的。不知道怎么创建
        Calendar c = Calendar.getInstance();
        // 创建指定的日期的Calendar对象
        Calendar c1 = Calendar.getInstance();
        c1.set(2009, 6, 12);
        System.out.println(c1);

        // 只是设定某个值的字段,其他的数值重新计算
        c1.set(Calendar.DATE, 10);

        // 添加日期，其他的数值会重新计算
        c1.add(Calendar.DATE, 8);
        c1.add(Calendar.DATE, -8);
    }

    @Test
    public void s2(){
        Calendar c1 = Calendar.getInstance();
        int i = c1.get(Calendar.DATE);
        int i1 = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);
        System.out.println(i1);
    }
    @Test
    public void s3(){
        Calendar s1 = GregorianCalendar.getInstance();
        System.out.println(s1.getTimeZone());
    }

    @Test
    public void s4(){
        String[] mouths = {
                "jans","Feb","Mar"
        };
        int year;
        GregorianCalendar s1 = new GregorianCalendar();
        System.out.println("date: ");
        System.out.println(mouths[s1.get(Calendar.MONTH)]);
        System.out.println(" "+ s1.get(Calendar.DATE) + " ");
        System.out.println(year = s1.get(Calendar.YEAR));
        System.out.println("Time");
        System.out.println(s1.get(Calendar.HOUR) + ":");
        System.out.println(s1.get(Calendar.MINUTE) + ":");
        System.out.println(s1.get(Calendar.SECOND));

        // 测试是否为闰年
        if (s1.isLeapYear(year)){
            System.out.println("当前是闰年");
        }else{
            System.out.println("当前不是闰年");
        }
    }
}
