package com.example.building_dagger.performace;

import android.util.Log;

public class Performance {
    private static final String TAG = "Performance";

    private WaterProof waterProof;

    public Performance(WaterProof waterProof) {
        this.waterProof = waterProof;
        Log.e(TAG, "Performance: OK");
    }
}
