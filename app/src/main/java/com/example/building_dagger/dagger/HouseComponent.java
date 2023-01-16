package com.example.building_dagger.dagger;


import com.example.building_dagger.House;
import com.example.building_dagger.MainActivity;
import com.example.building_dagger.Materials.Materials;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = { OutfitModule.class,
                        PowerSystemModule.class,
                        PerformanceModule.class,
                        RedBrickMaterialsModule.class})
public interface HouseComponent {
    // 組成House的Component(構成要素)有哪些：
    // TODO: 2022-12-07 建立dagger

    House gethouse();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder quantity(@Named("quantity") int quantity);

        @BindsInstance
        Builder height(@Named("height") int height);

        HouseComponent build();
    }

//    @Component.Builder
//    interface Build{
//        @BindsInstance
//        Build quantity(int quantity);
//
//        @BindsInstance
//        Build height(int height);
//
//        HouseComponent build();
//    }
}
