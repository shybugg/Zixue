package com.shybug_class5;

public class Zi extends Fu{
    public void method(){
        System.out.println("子类中的method被调用");
    }
    public void show (){
        super.show();
        System.out.println("子类的show被调用");
    }
}
