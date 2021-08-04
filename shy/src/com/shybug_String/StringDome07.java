package com.shybug_String;

import java.util.Scanner;

public class StringDome07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();

        String s = string(line);
        System.out.println(s);
    }
    public static String string (String s){
        String ss = "";

        for (int i=s.length()-1;i>=0;i--){
            ss += s.charAt(i);
        }

            return ss;
    }
}
