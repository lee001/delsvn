package com.example.abstractFactory;

import com.example.simpleFactory.Car;

/**
 * 抽象工厂模式(abstract factory)
 * Created by zw on 2017/11/15.
 * @author zw
 */
public interface CarType {
    Car getSportCar(String carName);

    Car getBuiCar(String carName);

    Car getFastCar(String carName);
}
