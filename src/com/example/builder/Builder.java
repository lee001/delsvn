package com.example.builder;

/**
 * 建造模式
 * Created by zw on 2017/11/15.
 * @author zw
 */
public interface Builder {
    /**
     * 创建部件A
     */
    void buildPartA();

    /**
     * 创建部件B
     */
    void buildPartB();

}
