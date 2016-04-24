package com.blue.dp31.InterceptingFilterPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
