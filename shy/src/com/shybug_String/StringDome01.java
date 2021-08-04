package com.shybug_String;

public class StringDome01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] cha = {'a', 'b', 'c'};
        String s2 = new String(cha);
        System.out.println(s2);
        byte[] byt = {99, 9, 8};
        String s3 = new String(byt);
        System.out.println(s3);
        String s4 = new String("abc");
        System.out.println(s4);
        String s5 = "abc";
        System.out.println(s5);
    }
}
