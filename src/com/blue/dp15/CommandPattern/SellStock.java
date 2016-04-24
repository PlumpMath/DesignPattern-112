package com.blue.dp15.CommandPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
