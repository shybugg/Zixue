package com.shybug_YunDongYuan;

public abstract class Player extends Preson {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
    public abstract void Study();
}
