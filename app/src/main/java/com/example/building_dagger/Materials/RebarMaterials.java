package com.example.building_dagger.Materials;

import android.util.Log;

import javax.inject.Inject;

public class RebarMaterials implements Materials{
    private static final String TAG = "RebarMaterials";

    @Inject
    public RebarMaterials() {
    }

    @Override
    public void BuildingMaterials() {
        Log.e(TAG, "Building Materials is Rebar!");
    }
}
