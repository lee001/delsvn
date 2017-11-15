package com.example.builder;

/**
 * 建造模式
 * Created by zw on 2017/11/15.
 * @author zw
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPartA();
        builder.buildPartB();
    }
}
