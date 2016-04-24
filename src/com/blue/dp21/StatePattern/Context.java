package com.blue.dp21.StatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
