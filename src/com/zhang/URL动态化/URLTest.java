package com.zhang.URL动态化;

import java.security.MessageDigest;

/**
 * @author ElloeStudy(Sifa Zhang)
 * @create 2022-06-20 14:10
 * To: 真常应物，真常得性，常清常静，常清静矣
 */
public class URLTest {
    /**
     * Url md5加密
     * @param url
     * @return
     */
    public static String getKuaishousign( String url){
        try {
            MessageDigest md5 =MessageDigest.getInstance("MD5" );
            md5.update((url).getBytes("UTF-8"));
            byte[] b = md5.digest();
            int i;
            StringBuffer buf = new StringBuffer();
            for (int offset =0;offset < b.length;offset++){
                i =b[offset];
                if (i<0){i += 256;}
                if(i<16){
                    buf.append("0");}
                buf.append( Integer.toHexString(i));
            }
            url = buf.toString();
            System.out.println( "result =" + url);
        }catch (Exception e){
            //log.error( "error",e);
        }
        return url;
    }


    public static void main(String[] args) {
        String url = "www.baidu.com/a/b";
        getKuaishousign(url);
    }
}
