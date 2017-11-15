package com.example;

/**
 * 简单工厂模式(也叫静态工厂模式)
 * Created by zw on 2017/11/15.
 * @author zw
 */
public class BMWCar implements Car{

    @Override
    public void drive() {
        System.out.println("BMWCar");
    }
}