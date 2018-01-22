package com.example.a207_1.androidcafe;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean netOk;

    private boolean isDualPane = false;
    private FragmentDetail fragmentDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        netOk = NetworkHelper.hasNetworkAcces(this);
        Toast.makeText(this, "Network OK: "+ netOk, Toast.LENGTH_LONG).show();

        FragmentManager fragmentManager = getFragmentManager();
        fragmentDetail = (FragmentDetail)
                fragmentManager.findFragmentById(R.id.fragmentL);

        View fragmenDView = findViewById(R.id.fragmentL);
        isDualPane = fragmenDView != null && fragmenDView.getVisibility() ==
                View.VISIBLE;

    }

    public void displayDetail(Menu menu) {

        if (isDualPane) {// Tablet
            fragmentDetail.displayData(menu);

        } else {// Smartphone
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("menu", menu);

            startActivity(intent);         }     }

}

