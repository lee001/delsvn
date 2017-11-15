package com.example;

/**
 * 饿汉式单例模式
 * Created by zw on 2017/11/15.
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return instance;
    }
}
