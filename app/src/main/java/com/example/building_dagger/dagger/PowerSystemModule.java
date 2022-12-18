package com.example.building_dagger.dagger;


import com.example.building_dagger.powersystem.HomeAppliances;
import com.example.building_dagger.powersystem.PowerSystem;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class PowerSystemModule {

    // TODO: 2022-12-09 基本完成

    @Provides
    static HomeAppliances providehomeappliances(){
        HomeAppliances homeAppliances = new HomeAppliances();
        homeAppliances.setcomplete();
        return homeAppliances;
    }

    @Provides
    static PowerSystem providePowerSystem(HomeAppliances homeAppliances){
        return new PowerSystem(homeAppliances);
    }
}
