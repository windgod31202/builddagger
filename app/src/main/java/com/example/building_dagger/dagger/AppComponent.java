package com.example.building_dagger.dagger;


import com.example.building_dagger.worker.Worker;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = WorkerModule.class)
public interface AppComponent {

    Worker getWorker();
}
