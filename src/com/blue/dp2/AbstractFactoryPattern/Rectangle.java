package com.blue.dp2.AbstractFactoryPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
