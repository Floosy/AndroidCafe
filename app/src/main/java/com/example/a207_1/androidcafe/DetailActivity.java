package com.example.a207_1.androidcafe;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jetbrains.annotations.Nullable;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Menu menu = getIntent().getParcelableExtra("menu");

        FragmentManager fragmentManager = getFragmentManager();
        FragmentDetail detailFragment = (FragmentDetail) fragmentManager.findFragmentById(R.id.fragmentL);
        detailFragment.displayData(menu);
    }

}
