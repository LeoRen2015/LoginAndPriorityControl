package com.waya.common.Utils;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * Created by user on 2018/1/29.
 */
public class IdUtils {
    public static String getRandomUUIDString(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static String getMd5fromString(String password){
        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(password.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }

            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
