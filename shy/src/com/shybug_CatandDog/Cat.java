package com.shybug_CatandDog;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫可以吃骨头");
    }
    public void show (){
        System.out.println("猫可以跳了");
    }
}
