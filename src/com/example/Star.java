package com.example;

/**
 * 输出倒塔三角，从上往下输出
 * Created by zw on 2017/11/8.
 */
public class Star {
    public static void main(String[] args) {
        for(int row = 1; row <= 6; row++){
            for(int space = 1; space < row; space++){
                System.out.print(" ");
            }
            for(int col = 11; col >= 2*row-1; col--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
