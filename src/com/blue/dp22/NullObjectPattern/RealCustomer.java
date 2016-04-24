package com.blue.dp22.NullObjectPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
