package com.zhang.test.test1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-03-27 23:12
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 20);
        map.put("sex", "男");
        map.put("phone", "13800000000");
        map.put("account", "123456789");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String s = "key====>" + entry.getKey() + ",value===>" + entry.getValue();
            System.out.println(s);
        }
    }

    @Test
    public void s1(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "张三");
        map.put("sno", "0194418");

        for(Map.Entry<String,String> entry : map.entrySet()){
            String kv = "key: " + entry.getKey() + ", value: " + entry.getValue();
            System.out.println(kv);
        }
    }
}
