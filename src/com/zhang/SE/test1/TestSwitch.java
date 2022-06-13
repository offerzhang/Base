package com.zhang.SE.test1;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-01 17:50
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class TestSwitch {
    public static void main(String[] args) {
        int x = 4;
        switch (x){
            case 1:
                System.out.println("优秀！！");
                break;
            case 4:
                System.out.println("回答错误");
                break;
            default:
                System.out.println("其余的都不对");
        }

        // 支持字符串
        String str = "zhang";
        switch (str){
            case "elloe":
                System.out.println("yes");
                break;
            case "zhang":
                System.out.println("正确");
        }
    }
}
