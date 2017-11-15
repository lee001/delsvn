package com.example.builder;

/**
 * 建造模式
 * Created by zw on 2017/11/15.
 * @author zw
 */
public class test {
    public static void main(String[] args) {
        ConcreateBuilder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();

    }
}
