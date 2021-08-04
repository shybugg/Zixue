package com.shybug_YunDongYuan;

public class PingPangCoach extends Coach implements Speak{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜和大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球说英语");
    }
}
