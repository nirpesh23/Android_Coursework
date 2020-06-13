package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends Fragment {

    Button chest_btn,profile_icon;
    ImageButton profile;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_home, container,false);

        profile = (ImageButton) v.findViewById(R.id.profile_icon);
        chest_btn = (Button) v.findViewById(R.id.chestbtn);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),UserProfile.class));
            }
        });
        chest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),workouts.class));
            }
        });
        return v;
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.chestbtn:
//                Intent intent = new Intent(getActivity(),activity_workouts.class);
//                startActivity(intent);
//                break;
//
//            case R.id.profile:
//                startActivity(new Intent(getActivity(),UserProfile.class));
//        }
//    }
}
