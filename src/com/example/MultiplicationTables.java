package com.example;

/**
 * 九九乘法表
 * Created by zw on 2017/11/8.
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "   ");
            }
            System.out.println();
        }

    }
}
