package com.example.timetracker;

import android.app.Application;

import com.example.timetracker.userclasses.MyObjectBox;

import io.objectbox.BoxStore;

public class LoginApplication extends Application {
    private BoxStore boxStore;

    @Override
    public void onCreate(){
        super.onCreate();
        boxStore = MyObjectBox.builder().androidContext(this).build();
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}
