package com.example.building_dagger.Materials;

import android.util.Log;

import javax.inject.Inject;

public class RedBrickMaterials implements Materials{
    private static final String TAG = "RedBrickMaterials";

    @Inject
    public RedBrickMaterials() {
    }

    @Override
    public void Building() {
        Log.e(TAG, "Building Materials is RedBrick!");
    }
}
