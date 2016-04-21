package com.blue.dp2.AbstractFactoryPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
