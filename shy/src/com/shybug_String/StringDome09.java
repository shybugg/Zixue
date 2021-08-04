package com.shybug_String;

public class StringDome09 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb =new StringBuilder();
       /*
         调用方法
        StringBuilder sb2 = sb.append("你好");
         System.out.println("sb:"+sb);
         System.out.println("sb2:"+sb2);
        System.out.println(sb==sb2);
        */
      /*  sb.append("hello");
        sb.append("word");
        sb.append(100);
        System.out.println(sb);

       */
        // 链式编程

        sb.append("hello").append("word").append("java").append(100);
        System.out.println("链式"+sb);
        // 反转
        sb.reverse();
        System.out.println(sb);
    }
}
