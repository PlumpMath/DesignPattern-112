package com.blue.dp4.BuilderPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
