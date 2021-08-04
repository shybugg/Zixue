package com.shybug_ArrayList;

import java.util.ArrayList;

public class ArrayListDome1 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("hello");
        System.out.println(arrayList);
        arrayList.add("hello");
        arrayList.add("word");
        arrayList.add("java");


        arrayList.add(3,"shybug");

        System.out.println(arrayList);

    }
}
