package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_workouts extends Fragment implements View.OnClickListener{

    View v;
    Button workouts;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_workouts,container,false);

        workouts = (Button) v.findViewById(R.id.button_w);
        workouts.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_w:
                break; //break is required after every case statement otherwise the other case won't work
        }
    }


//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
}
