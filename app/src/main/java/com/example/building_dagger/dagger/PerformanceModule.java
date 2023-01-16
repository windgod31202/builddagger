package com.example.building_dagger.dagger;


import com.example.building_dagger.performace.Performance;
import com.example.building_dagger.performace.WaterProof;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PerformanceModule {

    @Provides
    static WaterProof provideWaterProof(){
        WaterProof waterProof = new WaterProof();
        waterProof.check();
        return waterProof;
    }

    @Provides
    static Performance providePerformance(WaterProof waterProof){
        return new Performance(waterProof);
    }

    @Named("one")
    @Provides
    static int provideOne(){
        return 1;
    }

    @Named("two")
    @Provides
    static int provideTwo(){
        return 2;
    }


}
