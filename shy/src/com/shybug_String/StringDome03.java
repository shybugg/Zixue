package com.shybug_String;

import java.util.Scanner;

public class StringDome03 {
    public static void main(String[] args) {
        String username = "shybug";
        String password = "biefan";

        // 机会

        for (int x = 0; x < 3; x++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码:");
            String pwd = sc.nextLine();

            //判断登录
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                System.out.println("尊贵的VIP用户:" + name);
                break;
            } else {
                if (2 - x == 0) {
                    System.out.println("账号锁定了 联系管理员解开");
                } else {
                    // 0 1 2
                    // 判断机会还有多少次
                    System.out.println("登录失败 你还有" + (2 - x) + "次机会");
                }
            }

        }
    }
}
