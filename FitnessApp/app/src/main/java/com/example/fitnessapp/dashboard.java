package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_nav_of_dashboard);


//        shows home screen when opened first time
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard,new home()).commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.nav_home:
                        fragment = new home();
                        break;
                    case R.id.nav_custom_workouts:
                        fragment = new workouts();
                        break;
                    case R.id.nav_diet:
                        fragment = new diet();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_dashboard,fragment).commit();
                return true;
            }
        });
    }
}
