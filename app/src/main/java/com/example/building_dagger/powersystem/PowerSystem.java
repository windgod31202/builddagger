package com.example.building_dagger.powersystem;

import android.util.Log;

public class PowerSystem {
    private static final String TAG = "PowerSystem";

    private HomeAppliances homeAppliances;

    public PowerSystem(HomeAppliances homeAppliances) {
        this.homeAppliances = homeAppliances;
        Log.e(TAG, "PowerSystem OK");
    }
}
