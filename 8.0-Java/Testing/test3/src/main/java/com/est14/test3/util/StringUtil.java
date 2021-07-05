package com.est14.test3.util;

public class StringUtil {

    public static String repeat(String str, int times){
        StringBuilder result = new StringBuilder();

        if(times < 0){
            throw new IllegalArgumentException("Negative times is not allowed");
        }
        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }
}
