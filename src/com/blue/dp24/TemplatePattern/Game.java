package com.blue.dp24.TemplatePattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
