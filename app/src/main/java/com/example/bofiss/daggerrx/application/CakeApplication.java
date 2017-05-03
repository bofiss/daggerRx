package com.example.bofiss.daggerrx.application;

import android.app.Application;

/**
 * Created by M on 03/05/2017.
 */

public class CakeApplication extends  Application{
    @Override
    public void onCreate(){
        super.onCreate();
        initializeApplicationComponenet();
    }

    private void initializeApplicationComponenet() {
        DaggerApplicationComponent.builder.create();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
