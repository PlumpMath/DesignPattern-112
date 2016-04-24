package com.blue.dp19.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
