package com.blue.dp4.BuilderPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken  Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
