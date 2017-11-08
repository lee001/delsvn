package com.example;

/**
 * 求5的阶乘
 * Created by zw on 2017/11/8.
 */
public class Recurrence {

    public static void main(String[] args) {
        int n = 5;
        n = n * fun(n - 1);
        System.out.println(n);
    }

    private static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fun(n - 1);
    }
}
