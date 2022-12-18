package com.example.building_dagger;

import android.util.Log;

import com.example.building_dagger.outfit.Outfit;
import com.example.building_dagger.performace.Performance;
import com.example.building_dagger.powersystem.PowerSystem;

import javax.inject.Inject;


public class House {
    // TODO: 2022-12-07 建立class其是House必備的Module，outfit_Module。
    private static final String TAG = "House";

    // 包含的有外觀與電力系統。
    private Outfit outfit;
    private PowerSystem powerSystem;
    private Performance performance;

    //在Constructor上方建立@Inject註解，可以讓Dagger建立時知道該建構元是實例化House的方法。
    @Inject
    public House(Outfit outfit, PowerSystem powerSystem, Performance performance) {
        this.outfit = outfit;
        this.powerSystem = powerSystem;
        this.performance = performance;
        Log.e(TAG, "House OK");
    }

    /**
     *  所有物件準備完成，開始啟動。
     */
    public void completed(){
        Log.e(TAG, "completed!!");
    }
}