package com.example.building_dagger;

import android.app.Application;

import com.example.building_dagger.dagger.AppComponent;
import com.example.building_dagger.dagger.DaggerAppComponent;

public class ExampleAPP extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }
    public AppComponent getComponent(){
        return component;
    }
}
