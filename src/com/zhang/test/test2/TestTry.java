package com.zhang.test.test2;

import java.util.HashMap;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-08 14:10
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestTry implements AutoCloseable{

    private String name;

    public TestTry (String name){
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        System.out.println("I am " + name + " and to closed" );
        throw new Exception("close " + name + " exception");
    }

    public static void main(String[] args) {
        // 可变长参数
       change("11","222","2223","name","this");

       try(
            TestTry res1 = new TestTry("res1");
            TestTry res2 = new TestTry("res2");
       ) {
           System.out.println("I want to go something");
           throw new Exception("go something");
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
           System.out.println("done");
       }
    }

    public static void change(String name ,String ... age){
        for (String s : age) {
            System.out.println(s);
        }
        System.out.println("=========");
        // 遍历输出（语法糖）
        HashMap<String, String> map = new HashMap<>();
        map.put("user1", "张三");
        map.put("user2", "张三2");
        map.put("user3", "张三3");
            // 所需要传入的参数（map的泛型类型）
        map.forEach((s,t) -> System.out.println(s + t));
        System.out.println("*******");
//        map.forEach(System.out::println); map不能，user可以遍历
//        for(User u : user){
//            System.out.println(u);
//        }

    }
}
