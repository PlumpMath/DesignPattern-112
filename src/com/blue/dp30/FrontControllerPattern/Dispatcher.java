package com.blue.dp30.FrontControllerPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
