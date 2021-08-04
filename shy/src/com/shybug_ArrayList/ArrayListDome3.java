package com.shybug_ArrayList;

import java.util.ArrayList;

public class ArrayListDome3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("shy老师");
        arr.add("shy");
        arr.add("bug");
      /*  System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        for (int i=0;i<3;i++){
            System.out.println(arr.get(i));
        }
         */
       // System.out.println(arr.size());
        for (int i=0;i<arr.size();i++){
           String s = arr.get(i);
            System.out.println(s);
        }
    }
}
