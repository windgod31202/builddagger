package com.example.building_dagger.dagger;

import com.example.building_dagger.Materials.Materials;
import com.example.building_dagger.Materials.RebarMaterials;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class RebarMaterialsModule {

    //abstract <修飾子> 回傳型態 方法名稱(<參數...>);
    @Binds
    abstract Materials bindRebarMaterial(RebarMaterials rebarMaterials);
}
