package com.blue.dp15.CommandPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
