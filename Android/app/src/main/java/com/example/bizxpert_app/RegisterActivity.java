package com.example.bizxpert_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bizxpert_app.databinding.ActivityRegisterBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    // Add database reference
    DatabaseReference ref;

    // Assign the Users class
    Users users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Create an object
        users = new Users();
        // child("") : A new DatabaseReference to the given path
        ref = FirebaseDatabase.getInstance().getReference().child("Users");
        binding.btnRegister.setOnClickListener(v -> {
            // Set Email and password input
            users.setEmail(binding.inputEmailRego.getText().toString().trim());
            users.setPassword(binding.inputPasswordRego.getText().toString());

            // Push the users object
            ref.push().setValue(users);
            Toast.makeText(RegisterActivity.this, "data is inserted successfully.", Toast.LENGTH_SHORT).show();
        });

        binding.txtForLogin.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this, LoginActivity.class)));
    }
}