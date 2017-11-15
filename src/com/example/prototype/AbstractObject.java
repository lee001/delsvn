package com.example.prototype;

/**
 * 原型模式(prototype)
 * Created by zw on 2017/11/15.
 * @author zw
 */
public abstract class AbstractObject implements Cloneable {

    String objectName;

    public void setObjectName(String spoonName){
        this.objectName = objectName;
    }

    public String getObjectName(){
        return this.objectName;
    }

    @Override
    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException exception){
            System.err.println("AbstractObject is not Cloneable");
        }
        return object;
    }
}
