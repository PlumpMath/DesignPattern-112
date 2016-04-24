package com.blue.dp20.ObserverPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
