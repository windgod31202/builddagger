package com.example.building_dagger.dagger;


import com.example.building_dagger.House;
import com.example.building_dagger.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = { OutfitModule.class,
                        PowerSystemModule.class,
                        PerformanceModule.class })
public interface HouseComponent {
    // 組成House的Component(構成要素)有哪些：
    // TODO: 2022-12-07 建立dagger

    House gethouse();

    void inject(MainActivity mainActivity);
}
