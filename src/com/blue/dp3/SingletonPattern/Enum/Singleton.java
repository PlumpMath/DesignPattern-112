package com.blue.dp3.SingletonPattern.Enum;

/**
 * Created by bluewaitor on 2016/4/19.
 */

/**
 * 枚举
 * 线程安全
 * 无懒加载
 */

public enum  Singleton {
    INSTANCE;
    public void whateverMethod(){
        System.out.println("nihao");
    }
}
