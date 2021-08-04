package com.shybug_YunDongYuan;

public class PingPangYdy extends Player implements  Speak{
    public PingPangYdy() {
    }

    public PingPangYdy(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("教你打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("吃的白米饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说中文");
    }
}
