package com.lida.util;

/**
 * @author join wick
 * @version 1.0.0
 * @description String 工具类
 * @createDate 2021/3/7 10:02
 * @since 1.0.0
 */
public class StringUtil {
    private StringUtil() {

    }

    /**
     * check whether the str is empty
     *
     * @param str String
     * @return boolean
     */
    public static boolean isEmpty(String str) {
        return null == str || str.length() == 0;
    }
}
