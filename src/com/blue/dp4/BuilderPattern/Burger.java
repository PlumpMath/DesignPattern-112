package com.blue.dp4.BuilderPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
