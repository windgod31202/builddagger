package com.example.building_dagger.dagger;

import com.example.building_dagger.Materials.Materials;
import com.example.building_dagger.Materials.RebarMaterials;

import dagger.Module;
import dagger.Provides;

@Module
public class RebarMaterialsModule {
    @Provides
    Materials provideMaterial(RebarMaterials materials){
        return materials;
    }
}
