package com.blue.dp28.CompositeEntityPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();

        client.setData("Second Test", "Data1");
        client.printData();
    }
}
