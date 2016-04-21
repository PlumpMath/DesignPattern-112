package com.blue.dp5.PrototypePattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
