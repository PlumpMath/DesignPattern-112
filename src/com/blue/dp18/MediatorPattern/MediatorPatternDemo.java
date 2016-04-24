package com.blue.dp18.MediatorPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
