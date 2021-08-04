package com.shybug_CatandDog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void show (){
        System.out.println("狗可以跳了");
    }
}
