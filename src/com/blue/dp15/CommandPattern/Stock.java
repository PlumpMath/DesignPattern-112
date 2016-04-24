package com.blue.dp15.CommandPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
