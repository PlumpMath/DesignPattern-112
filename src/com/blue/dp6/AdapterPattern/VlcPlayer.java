package com.blue.dp6.AdapterPattern;

/**
 * Created by bluewaitor on 2016/4/20.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
