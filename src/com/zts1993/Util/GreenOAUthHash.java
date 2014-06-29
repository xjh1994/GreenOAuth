package com.zts1993.Util;

/**
 * Created by TianShuo on 14-6-29.
 */
public class GreenOAUthHash {

    public static String GenHash(String plainText) {

        String hashcode =System.currentTimeMillis()+"greenoauth"+plainText;

        hashcode=MD5Util.MD5(hashcode);


        return hashcode;
    }
}