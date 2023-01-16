package com.example.building_dagger.dagger;

import com.example.building_dagger.Materials.Materials;
import com.example.building_dagger.Materials.RebarMaterials;
import com.example.building_dagger.Materials.RedBrickMaterials;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class RedBrickMaterialsModule {

//    private int quantity;
//    private int height;
//
//    public RedBrickMaterialsModule(int quantity, int height) {
//        this.quantity = quantity;
//        this.height = height;
//    }

    //綁定單個
    @Binds
    abstract Materials bindRedBrickMaterial(RedBrickMaterials redBrickMaterials);

//    @Provides
//    Materials provideRedBrickMaterial(){
//        return new RedBrickMaterials(quantity, height);
//    }

}
