package com.shybug_String;

public class StringDome08 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sc.length:"+sb.length());

        //创建对象
        StringBuilder sb2 = new StringBuilder("hello word");
        System.out.println(sb2);
        System.out.println("sb2.length:"+sb2.length());
    }
}
