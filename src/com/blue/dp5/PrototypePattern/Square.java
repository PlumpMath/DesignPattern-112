package com.blue.dp5.PrototypePattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
