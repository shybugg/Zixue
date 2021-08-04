package com.shybug_String;

public class StringDome11 {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        String s1 = arrToString(arr);
        System.out.println(s1);
    }
    public static String arrToString (int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i =0;i<arr.length;i++){
            if (i==arr.length -1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",").append(" ");
            }
        }

        sb.append("]");
        String s = sb.toString();
        return s;
    }
}