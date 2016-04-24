package com.blue.dp21.StatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
