package com.example.building_dagger.dagger;


import com.example.building_dagger.House;
import com.example.building_dagger.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component (dependencies = AppComponent.class, modules = { OutfitModule.class,
                        PowerSystemModule.class,
                        PerformanceModule.class,
                        RedBrickMaterialsModule.class})
public interface ActivityComponent {
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

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
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
