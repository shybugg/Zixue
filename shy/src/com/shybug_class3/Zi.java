package com.shybug_class3;

public class Zi extends Fu{
    public int age =20;
    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
