package com.example.building_dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.building_dagger.dagger.DaggerHouseComponent;
import com.example.building_dagger.dagger.HouseComponent;
import com.example.building_dagger.outfit.Outfit;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    // TODO: 2022-12-07 Component建構OK

    @Inject
    House house;

    @Inject
    Outfit outfit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HouseComponent houseComponent = DaggerHouseComponent.create();

        houseComponent.inject(this);

        house.completed();

        // TODO: 2022-12-12 HackMD筆記
    }
}