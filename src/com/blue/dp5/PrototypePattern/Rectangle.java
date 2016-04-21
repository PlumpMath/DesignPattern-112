package com.blue.dp5.PrototypePattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
