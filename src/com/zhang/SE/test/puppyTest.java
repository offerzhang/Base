package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 13:41
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class puppyTest {
    public static void main(String[] args) {
        // 测试 Private 与 Protected
        // Private 只有在同一个类里面才能直接通过对象那个操作符. 操作对象的·属性
        // Protected 只有在同一个包里面才能直接对那个对象得操作符. 操作对象的属性
        puppy jaclk = new puppy("jaclk");
        jaclk.setPuppyAge(20);
        jaclk.getPuppyAge();
        System.out.println(jaclk.puppyAge);
    }
}

// 一个源文件只能有一个Public类
// 一个源文件可以有多个非public类
// 源文件的类名应该与public的类名一致
// 一个源文件里面 package语句应该放在源文件的行首
// 如果源文件里面包括import语句，那么，import语句应该放在package与类定义之间
// import语句与package语句应该对源文件中定义的所有的类都有效，在同一源文件中，不能给不同的类给与不同的包声明
