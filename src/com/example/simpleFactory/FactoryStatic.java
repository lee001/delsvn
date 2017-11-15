package com.example.simpleFactory;

/**
 * 简单工厂模式(也叫静态工厂模式)
 * Created by zw on 2017/11/15.
 * @author zw
 */
public class FactoryStatic {

    public static Car getCar(String carName){
        if(carName.equalsIgnoreCase("QQCar")){
            return new QQCar();
        }else if(carName.equalsIgnoreCase("BMWCar")){
            return new BMWCar();
        }
        return null;
    }

    public static void main(String[] args) {
        Car car = FactoryStatic.getCar("QQCAR");
        car.drive();
    }
}
