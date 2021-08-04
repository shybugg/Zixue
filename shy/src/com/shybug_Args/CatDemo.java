package com.shybug_Args;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c =new Cat();
        co.useCat(c);
        Cat c2 = co.getcat();
        c2.cat();
    }
}
