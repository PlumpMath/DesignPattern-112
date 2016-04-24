package com.blue.dp22.NullObjectPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
