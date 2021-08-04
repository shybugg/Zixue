package com.shybug_static1;

public class Student {
    private String name = "shybug";
    private static String Un = "广西大学";

    public void show1(){

    }
    public  void show2(){
        System.out.println(name);
        System.out.println(Un);
        show1();
        show3();
    }
    public static void show3(){

    }
    public static void show4(){
        show3();
        System.out.println(Un);

    }
}
