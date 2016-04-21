package com.blue.dp2.AbstractFactoryPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
