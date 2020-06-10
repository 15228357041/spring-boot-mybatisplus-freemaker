package cn.chinau8.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Bxf
 * @desc 数据加密解密工具类
 * @date 2017年8月9日 09:03:07
 * */
public class MD5Util {

/**
 * @title MD5Encryption
 * @desc MD5加码 生成32位md5码 
 * */
public static void main(String[] args) {
    System.out.println(MD5Encryption("8888"));
}

 public static String MD5Encryption(String passwod){
     MessageDigest md5 = null;
     try{  
         md5 = MessageDigest.getInstance("MD5");
     }catch (Exception e){
         System.out.println(e.toString());
         e.printStackTrace();  
         return "";
     }  
     char[] charArray = passwod.toCharArray();  
     byte[] byteArray = new byte[charArray.length];  

     for (int i = 0; i < charArray.length; i++)  
         byteArray[i] = (byte) charArray[i];  
     byte[] md5Bytes = md5.digest(byteArray);  
     StringBuffer hexValue = new StringBuffer();
     for (int i = 0; i < md5Bytes.length; i++){  
         int val = ((int) md5Bytes[i]) & 0xff;  
         if (val < 16)  
             hexValue.append("0");  
         hexValue.append(Integer.toHexString(val));
     }  
     return hexValue.toString();  

 }

    /**
     * 进行MD5加密
     *
     * @param info
     *            要加密的信息
     * @return String 加密后的字符串
     */
    public static String encryptToMD5(String info) {
        byte[] digesta = null;
        try {
            // 得到一个md5的消息摘要
            MessageDigest alga = MessageDigest.getInstance("MD5");
            // 添加要进行计算摘要的信息
            alga.update(info.getBytes());
            // 得到该摘要
            digesta = alga.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 将摘要转为字符串
        String rs = byte2hex(digesta);
        return rs;
    }

    /**
     * 将二进制转化为16进制字符串
     *
     * @param b
     *            二进制字节数组
     * @return String
     */
    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs.toUpperCase();
    }
}
