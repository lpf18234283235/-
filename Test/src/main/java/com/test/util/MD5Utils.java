package com.test.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 密码加密工具类
 */
public class MD5Utils {
    /*密码加密的盐*/
    public final static String SALT = "be5e0323a9195ade";

    /**
     * 摘要转换
     * @param password
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String securePassword(String password) throws NoSuchAlgorithmException {
        //获取加密算法 
        MessageDigest md = MessageDigest.getInstance("MD5");
        //拼接密码
        password = password + SALT;
        //密码转换成md5摘要
        md.update(password.getBytes());
        //进行加密
        return  byteToString(md.digest());
    }
    /**
     *  明文加密密码
     * @param digest
     * @return
     */
    private static String byteToString(byte[] digest) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < digest.length; i++) {
            if (Integer.toHexString(0xFF & digest[i]).length() == 1) {
                builder.append("0").append(Integer.toHexString(0xFF & digest[i]));
            } else {
                builder.append(Integer.toHexString(0xFF & digest[i]));
            }
        }
       return builder.toString();
    }
}
