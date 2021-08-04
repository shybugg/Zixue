package com.shybug_YunDongYuan;

public abstract class Coach extends Preson {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
