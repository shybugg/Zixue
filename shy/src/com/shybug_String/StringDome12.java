package com.shybug_String;

import java.util.Scanner;

public class StringDome12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String line = sc.nextLine();
        String sss = myReveres(line);
        System.out.println(sss);
    }
    public static String myReveres(String s){
      /*  StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        return s1;

       */
      return new StringBuilder(s).reverse().toString();
    }
}
