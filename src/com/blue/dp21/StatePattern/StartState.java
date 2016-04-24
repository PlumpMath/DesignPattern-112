package com.blue.dp21.StatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
