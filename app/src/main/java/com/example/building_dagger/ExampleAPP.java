package com.example.building_dagger;

import android.app.Application;

import com.example.building_dagger.dagger.DaggerHouseComponent;
import com.example.building_dagger.dagger.HouseComponent;

public class ExampleAPP extends Application {

    private HouseComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerHouseComponent.builder()
                .height(220)
                .quantity(50)
                .build();
    }
    public HouseComponent getComponent(){
        return component;
    }
}
