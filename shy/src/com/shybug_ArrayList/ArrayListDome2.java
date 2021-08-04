package com.shybug_ArrayList;

import java.util.ArrayList;

public class ArrayListDome2 {
    public static void main(String[] args) {
        // 创建对象
        ArrayList<String> arr = new ArrayList<String>();
        // 添加元素
        arr.add("hello");
        arr.add("word");
        arr.add("shy");

       //System.out.println(arr.remove("word"));
        // System.out.println(arr.remove("javase"));
        //System.out.println(arr.remove(1));
        //System.out.println(arr.set(1,"javase"));
        //System.out.println(arr.get(1));
        System.out.println(arr.size());
        // 输出集合
        System.out.println("arr:"+arr);
    }
}
