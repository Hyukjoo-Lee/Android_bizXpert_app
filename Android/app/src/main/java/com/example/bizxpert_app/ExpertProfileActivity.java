package com.example.bizxpert_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bizxpert_app.databinding.ActivityExpertProfileBinding;

public class ExpertProfileActivity extends AppCompatActivity {

    private ActivityExpertProfileBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_expert_profile);
    }
}