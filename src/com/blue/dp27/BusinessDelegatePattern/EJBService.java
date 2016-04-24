package com.blue.dp27.BusinessDelegatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
