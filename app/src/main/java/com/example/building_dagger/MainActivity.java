package com.example.building_dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.building_dagger.dagger.DaggerHouseComponent;
import com.example.building_dagger.dagger.HouseComponent;
import com.example.building_dagger.dagger.RedBrickMaterialsModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    // TODO: 2022-12-07 Component建構OK

    @Inject
    House house1,house2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HouseComponent houseComponent = ((ExampleAPP) getApplication()).getComponent();

        houseComponent.inject(this);

        house1.completed();
        house2.completed();

        // TODO: 2022-12-12 HackMD筆記
    }
}