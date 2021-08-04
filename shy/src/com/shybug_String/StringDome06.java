package com.shybug_String;

public class StringDome06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }
    public static String arrToString (int[]arr) {
        String s = "";
        s += "[";

        for (int i = 0; i <arr.length; i++) {
            if (i == arr.length-1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ",";
            }
        }

        s += "]";
        return s;

    }
}
