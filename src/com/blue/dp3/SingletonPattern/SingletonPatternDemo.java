package com.blue.dp3.SingletonPattern;


/**
 * Created by bluewaitor on 2016/4/19.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }
}
