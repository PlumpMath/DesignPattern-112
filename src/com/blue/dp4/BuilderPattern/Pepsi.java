package com.blue.dp4.BuilderPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
