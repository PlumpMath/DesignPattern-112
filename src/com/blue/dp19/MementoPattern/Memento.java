package com.blue.dp19.MementoPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
