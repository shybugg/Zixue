package com.shybug_ChouXiang2;

public abstract class Animal {
    private int age =20;
    private final String city = "广西";
    public Animal (){}
    public Animal (int age){
        this.age = age;
    }
    public void show(){
        age = 40;
        System.out.println(age);
        //city ="上海";
        System.out.println(city);
    }
    public abstract void eat();
}
