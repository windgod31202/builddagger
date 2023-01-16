package com.example.building_dagger.dagger;


import com.example.building_dagger.worker.Worker;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WorkerModule {

    @Singleton
    @Provides
    static Worker provideWorker(){
        return new Worker();
    }
}
