package com.blue.dp7.BridgePattern;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
