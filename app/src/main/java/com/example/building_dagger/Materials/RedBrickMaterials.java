package com.example.building_dagger.Materials;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class RedBrickMaterials implements Materials{
    private static final String TAG = "RedBrickMaterials";

    private int quantity;
    private int height;

    @Inject
    public RedBrickMaterials(@Named("quantity") int quantity, @Named("height") int height) {
        this.quantity = quantity;
        this.height = height;
    }

    @Override
    public void BuildingMaterials() {
        Log.e(TAG, "Building Materials is RedBrick, "+
                "\nQuantity： "+quantity+
                "\nheight ："+height);
    }
}
