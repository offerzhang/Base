package com.zhang.reflect.re;

import java.lang.reflect.Method;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-27 15:31
 * To: 真常应物，真常得性，常清常静，常清静矣
 *
 * 对方法的读写
 */
public class ReTest5 {
    public static void main(String[] args) throws Exception {
        Class<?> myClass = Class.forName("com.zhang.reflect.Student");
        Object o = myClass.getDeclaredConstructor().newInstance();

        // 调用公有方法 无参数 无返回值
        System.out.println("------------");
        Class[] paramsClass = {};  // 数组大小为空  确定具体是哪个方法 参数的类型个数
        Object[] params = {};  // 需要调用的方法 需要 传递几个参数
        Method s1 = myClass.getDeclaredMethod("s1", paramsClass);
        s1.invoke(o, params);  // o.s1()  与这个等价  只会调用输出语句  默认不会返回结果

        // 调用公有方法 有参数 有返回值
        System.out.println("-----------------");
        Class[] paramsClass1 = {};
        paramsClass1 = new Class[1];   // 设置数组大小为1 重新创建了一个大小为1的数组
        paramsClass1[0] = String.class;
        Method eat = myClass.getDeclaredMethod("eat", paramsClass1);
        Object[] params1 = {};
        params1 = new Object[1];
        params1[0] = "鱼";
        Object result = eat.invoke(o, params1);  // 将返回值赋予一个变量
        System.out.println(result.toString());  // 输出返回值

        // 调用私有方法 无参数 有返回值
        System.out.println("------------");
        Class[] paramsClass2 = {};
        Object[] params2 = {};
        Method s2 = myClass.getDeclaredMethod("s2", paramsClass2);
        s2.setAccessible(true);  // 设置为可以访问
        Object invoke = s2.invoke(o, params2);
        System.out.println(invoke);

        // 调用私有方法 有参数 有返回值
        System.out.println("-------------");
        Class[] paramsClass3 = {};
        Object[] params3 = {};
        paramsClass3 = new Class[1];
        paramsClass3[0] = String.class;
        Method sleep = myClass.getDeclaredMethod("sleep", paramsClass3);
        params3 = new Object[1];
        params3[0] = "晚上睡觉";
        sleep.setAccessible(true);  // 设置为可以访问
        Object invoke1 = sleep.invoke(o, params3);
        System.out.println(invoke1.toString());


        Method s5 = myClass.getDeclaredMethod("s5", int.class);
        System.out.println(s5.getName());
    }
}
