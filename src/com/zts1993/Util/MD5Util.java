package com.zts1993.Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by TianShuo on 14-6-29.
 */
public class MD5Util {

    public static void main(String[] args) {
        System.out.println(MD5Util.MD5("zts"));


    }
    public static String MD5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
            //System.out.println("result: " + buf.toString());// 32位的加密
            //System.out.println("result: " + buf.toString().substring(8, 24));// 16位的加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


}
