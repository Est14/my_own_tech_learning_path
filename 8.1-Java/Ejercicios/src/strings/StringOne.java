package strings;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class StringOne {

    public static void main(String[] args) {
        //String[] names = {"Esteban", "Daniela", "Ivan", "Santiago", "Sofia", "Marcela"};

        int [] a = {100, 5, 8 ,77 ,4 ,7, 0};
        int [] b = {0, 2 ,3 ,9 ,23, 7, 900};
        System.out.println(MaxNumber(a));
        System.out.println(MaxNumber(b));

    }

    private static int[] combineTwoIntArr(int [] a, int []b){
        int [] c = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < a.length ; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
        }
        return c;
    }

    private static int MaxNumber(int [] nums){
        int result = nums[0];

        for (int i = 0; i < nums.length ; i++) {
            if (result < nums[i]){
                result = nums[i];
            }
        }

        return result;
    }

    private static void sortArray(String[] names) {
        int len = names.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

    }

    private static void reverseArray(String[] names) {
        int len = names.length;
        for (int i = 0; i < len; i++) {
            String current = names[i];
            String last = names[names.length - 1 - i];
            names[i] = last;
            names[names.length - 1 - i] = current;
            len--;
        }
    }

    public static void printArray(String[] a) {

        for (var x : a) {
            System.out.println(x);
        }
    }

    public static void printArray(int[] a) {

        for (var x : a) {
            System.out.println(x);
        }
    }
}

