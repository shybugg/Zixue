package com.shybug_String;

public class StringDome02 {
    public static void main(String[] args) {
        char[] cha = {'a','b','c'};
        String s1 = new String(cha);
        String s2 = new String(cha);
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("------------");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
