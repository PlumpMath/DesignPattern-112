package com.blue.dp18.MediatorPattern;


import java.util.Date;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
