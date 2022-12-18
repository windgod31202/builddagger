package com.example.building_dagger.dagger;

import com.example.building_dagger.outfit.Door;
import com.example.building_dagger.outfit.Outfit;
import com.example.building_dagger.outfit.Windows;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class OutfitModule {
    // TODO: 2022-12-08 建立@Provides將類別提供成物件。

    @Provides
    static Door providedoor(){
        //實例化Door類別。
        Door door = new Door();
        door.build();
        return door;
    }

    @Provides
    static Windows providewindows(){
        Windows windows = new Windows();
        windows.build();
        return windows;
    }

    @Provides
    static Outfit provideOutfit(Door door , Windows windows){
        return new Outfit(door,windows);
    }

}
