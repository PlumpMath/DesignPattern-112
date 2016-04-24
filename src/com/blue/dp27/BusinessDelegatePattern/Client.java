package com.blue.dp27.BusinessDelegatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Client {
    BusinessDelegate businessService;
    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }
    public void doTask(){
        businessService.doTask();
    }
}
