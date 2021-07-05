package com.est14.test3.romannums;

public class RomanNumbers {
    char[] r = {'I', 'V', 'X', 'L', 'C', 'M', 'D'};
    int[] a = {1, 5, 10, 50, 100, 500};
    String romanValue = "";

    public String toRomanNumber(int num){
        if(num >= 1){
            for (int i = 0; i < r.length ; i++) {
                if (num < 1) break;
               

            }
            return romanValue;
        }
        return null;
    }
}
