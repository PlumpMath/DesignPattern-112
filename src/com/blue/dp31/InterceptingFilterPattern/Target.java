package com.blue.dp31.InterceptingFilterPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
