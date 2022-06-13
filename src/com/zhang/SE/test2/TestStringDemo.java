package com.zhang.SE.test2;

import com.sun.org.apache.bcel.internal.generic.D2F;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-06 13:17
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestStringDemo {

    @Test
    public void s1(){
        String str1 = "runoob";  // String 直接创建对象
        String str2 = "runoob";  // String 直接创建对象
        String str3 = str1;   // 相同引用
        String str4 = new String("runoob");  // String 直接创建
        String str5 = new String("runoob");  // String 直接创建
        // 其中 str1 str2 str3 的字符串常量在公共池里面
        // 其中的 str4 str5 在堆上面创建
    }

    @Test
    public void s2(){
        // String 的构造方法
        // String 一旦创建了对象，它的值就不能够修改
        char[] helloArray = {'r','u','u','o'};
        String s = new String(helloArray);
        System.out.println(helloArray);
        System.out.println(s);
    }

    @Test
    public void s3(){
        // StringBuilder  字符串可以修改   线程不安全
        StringBuilder sb = new StringBuilder(10);
        sb.append("rubbood..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);
    }
    @Test
    public void s4(){
        // StringBuffer 字符串可以修改  线程安全的
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("学习聊天基地");
        System.out.println(sBuffer);
        sBuffer.insert(4, "Java");
        System.out.println(sBuffer);
        sBuffer.delete(3, 4);
        System.out.println(sBuffer);
    }

    @Test
    public void s5(){
        // 字符串的长度
        String site = "this is vary good!";
        System.out.println(site.length());
    }

    @Test
    public void s6(){
        String s1 = "Elloe is";
        String s2 = " good";
        System.out.println(s1.concat(s2));  // 等价于 s1 + s2
    }
    @Test
    public void s7(){
        // 字符串格式输出
        double floatVar = 0.11;
        int intVar = 1;
        String stringVar = "elloe";
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);

        System.out.println("====================");
        System.out.println(
                String.format("浮点型变量的值为 " +
                        "%f, 整型变量的值为 " +
                        " %d, 字符串变量的值为 " +
                        " %s", floatVar, intVar, stringVar)
        );
    }

    @Test
    public void s8(){
        // 字符串常用方法测试1


        String s1 = "this is good";
        String s2 = "app";
        System.out.println(s1.charAt(3));    // 返回索引处的char字符
        // 返回的值为正数 大于 ； 负数 小于 ； 0 相等
        System.out.println(s1.compareTo(s2)); // 返回ASCII的差值，两个字符串依次从左到右比较(按照在字典里面的字母顺序)

        String s3 = "ApP";
        System.out.println(s2.compareToIgnoreCase(s3));  // 比较两个字符串，不考虑大小写，可以一半大写，一半小写

        String s4 = "app";
        String s5 = "this is pap";
        StringBuffer stringBuffer = new StringBuffer("this is good app");
        System.out.println(s2.contentEquals(s4)); // 需要比较的字符串需要一模一样，才为true,否则为false
        System.out.println(s2.contentEquals(s5));
    }

    @Test
    public void s9() throws UnsupportedEncodingException {
        // 字符串常用方法测试2

        char[] helloArray = {'r','u','u','o'};
        String s = String.copyValueOf(helloArray);
        System.out.println(String.copyValueOf(helloArray));  // 返回指定数组的String表示
        // offset 表示偏移量，count新的子数组的大小
        System.out.println(String.copyValueOf(helloArray, 2, 2)); // 返回指定字符数组的子数组，按照给定的条件

        // 判断字符串是否以指定的后缀结束
        String s1 = "thisgood";
        System.out.println(s1.endsWith("good"));
        System.out.println(s1.endsWith("is"));

        // 将字符串与指定的对象比较
        System.out.println(s1.equals("thisgood"));
        System.out.println(s1.equals("thisgoods"));

        // 将字符串与另一个字符串比较，忽略大小写
        System.out.println(s1.equalsIgnoreCase("ThisGood"));

        // 将字符串装换为byte序列，存储为新的byte数组（使用平台的默认字符集）
        System.out.println(s1.getBytes());
        System.out.println(s1.getBytes()[0]);

        //将字符串装换为byte序列，存储为新的byte数组（使用指定的字符集）
        System.out.println(s1.getBytes("UTF-8"));

        // 将字符串装换为 字符数组，并将这个字符数组替换为目标数组的位置，
        // srcBegin 原数组的开始位置 ； secEnd 原数组的结束位置 ； char[] dst 目标数组 ； dstBegin 目标开始替换的位置
        char[] chs = {'s','r','c'};
        s1.getChars(0, 2, chs, 1);
        System.out.println(chs);

        // 返回这个字符串的哈希码
        System.out.println(s1.hashCode());

        // 返回字符在此字符串第一次出现的索引
        System.out.println(s1.indexOf("i"));

        // 返回字符在此字符串第一次出现的索引,从指定的索引位置开始搜索
        System.out.println(s1.indexOf("o", 3));
    }

    @Test
    public void s10(){
        // 字符串常用方法测试3

        // 返回字符串的规范化表示形式
        String s1 = "thisgood";
        System.out.println(s1.intern());

        // 返回字符串最后一次出现的索引
        System.out.println(s1.lastIndexOf("o"));

        // 返回字符串最后一次出现的索引(从指定的位置索引开始)
        System.out.println(s1.lastIndexOf('o', 4));

        // 返回字符串出现的最右边的索引
        System.out.println(s1.lastIndexOf("ood"));

        // 返回字符串出现的最右边的索引，从指定的位置索引开始
        System.out.println(s1.lastIndexOf("ood", 2));
    }

    @Test
    public void s11(){
        // 字符串常用方法测试3

        // 字符串的大小长度
        String s1 = "this-good";
        System.out.println(s1.length());

        // 是否匹配 给定的正则表达式
        System.out.println(s1.matches(".*-good"));

        // 测试两个字符串区域是否相等,忽略大小写
        // ignoreCase -- 如果为 true，则比较字符时忽略大小写 ;toffset -- 此字符串中子区域的起始偏移量
        //other -- 字符串参数; ooffset -- 字符串参数中子区域的起始偏移量 ;len -- 要比较的字符数
        String s2 = "www.baidu.com";
        String s3 = "baidu";
        System.out.println(s2.regionMatches(true, 4, s3, 0, 5));

        // 测试两个字符串区域是否相等
        System.out.println(s2.regionMatches(4, s3, 0, 5));

        // 替换字符串里面的所有出现的字符 ，oldChar newChar
        String s4 = "yes this good thiss";
        System.out.println(s4.replace("s", "a"));

        // 替换出现子字符串的地方
        // 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串
        System.out.println(s4.replaceAll("this", "your"));

        // 使用指定的正则表达式 拆分 字符串
        String str1 = "3-xuebi-20";
        String[] split = str1.split("-");  // 得到结果为一个数组
        System.out.println(split[1]);

        // 测试字符串是否以指定的前缀开始
        System.out.println(s4.startsWith("yes"));

        // 返回一个新的字符序列
        String ss = "thisgood";
        CharSequence charSequence = ss.subSequence(0, 3);
        System.out.println(ss.subSequence(0, 3));

        // 返回一个新的字符串
        System.out.println(ss.substring(2));

        // 返回为一个新的字符数组
        System.out.println(ss.toCharArray());
        System.out.println(ss.toCharArray()[0]);  // 数组通过下标取值

        // 将字符串的所有字符装换为小写
        String ss1 = "THIS is good";
        System.out.println(ss1.toLowerCase());

        // 返回此对象本身
        System.out.println(ss1.toString());

        // 将字符串的所有字符装换为大写
        System.out.println(ss1.toUpperCase());

        //  返回字符串的副本 ，忽略前导空白和尾部空白
        String ss2 = " www.baidu.com  ";
        System.out.println(ss2);
        System.out.println(ss2.trim());

        // 返回基本数据类型转换为string
        int x = 10;
        System.out.println(String.valueOf(x));

        // 是否包含指定的字符序列
        String str4 = "this is good";
        String str5 = "is";
        System.out.println(str4.contains(str5));

        // 判断字符串是否为空
        String str6 = "";
        String str7 = "123";
        System.out.println(str6.isEmpty());
        System.out.println(str7.isEmpty());
    }
}
