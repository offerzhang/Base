package com.zhang.object.enumTest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-22 16:04
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class Test6 {
    public static void main(String[] args) {
        for(Color6 myVar : Color6.values()){
            System.out.println(myVar.getColor() + "、");
        }
    }
}
/**
 * 枚举类有抽象方法，每个枚举类型都必须对其实现
 */
enum Color6{
    /**
     * 枚举元素
     */
    RED{
        @Override
        public String getColor(){
            return "红色";
        }
    },
    GREEN{
        @Override
        public String getColor(){
            return "绿色";
        }
    },
    BLUE{
        @Override
        public String getColor(){
            return "蓝色";
        }
    };
    public abstract String getColor();
}