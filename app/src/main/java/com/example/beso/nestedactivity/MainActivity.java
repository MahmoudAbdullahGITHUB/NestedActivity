package com.example.beso.nestedactivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BuForm1(View view) {
        Fragment fragment = new fragform1();

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
        .replace(R.id.mainLayout,fragment)
        .commit();
    }

    public void BuForm2(View view) {
        Fragment fragment = new fragform2();

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.mainLayout,fragment)
                .commit();
    }
}
