package com.blue.dp4.BuilderPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Ver Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
