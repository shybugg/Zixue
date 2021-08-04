package com.shybug_String;

public class StringDome10 {
    public static void main(String[] args) {
        /*
        StringBuilder sb = new StringBuilder();
        sb.append("shybug");
        String s = sb.toString();
        System.out.println(s);
         */

        String s = new String("别烦");
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
