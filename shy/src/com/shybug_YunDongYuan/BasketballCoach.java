package com.shybug_YunDongYuan;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练 教任何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("教练吃羊肉，和羊奶");
    }
}
