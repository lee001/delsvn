package com.example;

/**
 * 菲波那契数列
 * Created by zw on 2017/11/8.
 */
public class Fibonacii {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));

    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }
}
