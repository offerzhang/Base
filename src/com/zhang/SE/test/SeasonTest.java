package com.zhang.SE.test;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-02-28 13:18
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class SeasonTest {
    public static void main(String[] args) {
        // 枚举季节更替
        Season season = new Season();
        season.season = Season.Seasons.SPRING;
        System.out.println("季节更替完成");
    }
}
