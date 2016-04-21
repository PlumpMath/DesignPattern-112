package com.blue.dp7.BridgePattern;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
