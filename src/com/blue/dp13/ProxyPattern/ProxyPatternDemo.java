package com.blue.dp13.ProxyPattern;

/**
 * Created by bluewaitor on 2016/4/23.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("blue.png");

        image.display();

        System.out.println("");

        image.display();
    }
}
