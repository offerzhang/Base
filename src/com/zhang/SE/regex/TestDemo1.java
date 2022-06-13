package com.zhang.SE.regex;

import jdk.nashorn.internal.ir.CatchNode;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-19 8:23
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestDemo1 {
    @Test
    public void s1() {
        String content = "I am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串里面是否包含。。。字符串？ " + isMatch);
        String content1 = "this is   test";
        String pattern1 = "this\\s+is\\s+test";  // 测试是否含有多个空格
        boolean mat1 = Pattern.matches(pattern1, content1);
        System.out.println(mat1);
    }

    @Test
    public void s2(){
        String line = "this order was placed for QT3000! ok?";
        String pattern = "(\\D*)(\\d+)(.*)";
        // 创建Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 创建Matcher对象
        Matcher matcher = r.matcher(line);
        if (matcher.find()){
            System.out.println("found value: "+matcher.group(0));
            System.out.println("found value: "+matcher.group(1));
            System.out.println("found value: "+matcher.group(2));
            System.out.println("found value: "+matcher.group(3));
        }else{
            System.out.println("NO MATCH");
        }
        System.out.println("\\");
        System.out.println("\\\\");
    }

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattile cat";
    @Test
    public void s3(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;
        while (m.find()){
            count++;
            System.out.println("MATCHH number: "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
    private static final String REGEX1 = "foo";
    private static final String input1 = "fooooooooooooo";
    private static final String input2 = "oooofooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher1;
    private static Matcher matcher2;
    @Test
    public void s4(){
        // matches和lookingAt都尝试匹配一个输入序列模式
        // matches要求整个序列都匹配
        // lookingAt不需要整个都匹配，但是第一个字符需要匹配
        pattern = Pattern.compile(REGEX1);
        matcher1 = pattern.matcher(input1);
        matcher2 = pattern.matcher(input2);

        System.out.println(REGEX1);
        System.out.println(input1);
        System.out.println(input2);

        System.out.println(matcher1.lookingAt());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.lookingAt());
    }
    private static String REGEX2 = "dog";
    private static String INPUT3 = "the dog says meow. "+"All dogs say meow";
    private static String REPLACE = "cat";

    @Test
    public void s5(){
        Pattern pp = Pattern.compile(REGEX2);
        // get a matcher object
        Matcher m = pp.matcher(INPUT3);
        INPUT3 = m.replaceAll(REPLACE);
        System.out.println(INPUT3);
        INPUT3 =  m.replaceFirst("pig");
        System.out.println(INPUT3);
    }


    private static String REGEX5 = "a*b";
    private static String INPUT5 = "aabbfoooadafdafsf";
    private static String REPLACE5 = "-";

    @Test
    public void s6(){
        Pattern pp = Pattern.compile(REGEX5);
        // 获取matcher 对象
        Matcher mm = pp.matcher(INPUT5);
        StringBuffer sb = new StringBuffer();
        while(mm.find()){
            mm.appendReplacement(sb, REPLACE5);
        }
        mm.appendTail(sb);
        System.out.println(sb.toString());
        System.out.println(mm);
    }
}
