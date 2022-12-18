package com.example.building_dagger.outfit;

import android.util.Log;

import javax.inject.Inject;

public class Outfit {
    // TODO: 2022-12-07 外觀模組，內部有可以提供的物件，window、door。
    private static final String TAG = "Outfit";

    private Door door;
    private Windows windows;

    @Inject
    public Outfit(){
        Log.e(TAG, "Outfit: OK");
    }


    //具備回傳值，從OutfitModule呼叫的。
    public Outfit(Door door, Windows windows) {
        this.door = door;
        this.windows = windows;
        Log.e(TAG, "Outfit OK");
    }
}
