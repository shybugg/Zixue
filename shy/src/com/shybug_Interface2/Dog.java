package com.shybug_Interface2;

public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗会吃骨头？");
    }

    @Override
    public void Jump() {
        System.out.println("狗会飞");
    }
}
