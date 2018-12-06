package com.example.wind.sapi_adv;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeScreenActivity extends AppCompatActivity {

    private HomeFragment home;
    private SignupFragment signup;
    private SigninFragment signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        home = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.home);
        signup = (SignupFragment) getSupportFragmentManager().findFragmentById(R.id.signup);
        signin = (SigninFragment) getSupportFragmentManager().findFragmentById(R.id.signin);

        setContentView(R.layout.home);

    }
}