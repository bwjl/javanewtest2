package com.bear.javanewtest2;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/18 上午10:36
 * Description: md5加密
 */

public class Md5Demo {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String password = "a12345679";
        String salt = "6y47";

        String encryptPassword1 = md5Encrypt(password + salt);
        System.out.println(encryptPassword1);

        String encryptPassword2 = md5Encrypt(encryptPassword1);
        System.out.println(encryptPassword2);

    }

    private static String md5Encrypt(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //$encrypt = md5(md5(trim($new_pass) . $salt));
        MessageDigest md5 = MessageDigest.getInstance("md5");
        byte[] secretBytes = md5.digest((password).getBytes("UTF-8"));
        //System.out.println(Arrays.toString(encryptPassword)); //[11, -75, 34, 16, 102, -3, -105, -65, -55, 99, -14, 41, 116, 7, 42, 9]

        int i;
        StringBuffer buf = new StringBuffer("");

        for (int offset = 0; offset < secretBytes.length; offset++) {
            i = secretBytes[offset];
            if (i < 0) {
                i += 256;
            }
            if (i < 16) {
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }
        return buf.toString();
    }

}
