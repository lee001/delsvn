package com.example;

/**
 * 工厂方法模式
 * Created by zw on 2017/11/15.
 * @author zw
 */
public class QQDriver implements Driver{
    @Override
    public Car driveCar() {
        return new QQCar();
    }

    public static void main(String[] args) {
        Driver driver = new QQDriver();
        Car car = driver.driveCar();
        car.drive();
    }
}
