package com.example.wind.sapi_adv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListingFragment listing;
    private DataInputFragment dataInput;
    private DetailsFragment details;
    private HomeFragment home;
    private SignupFragment signup;
    private SigninFragment signin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listing = (ListingFragment) getSupportFragmentManager().findFragmentById(R.id.list);
        dataInput = (DataInputFragment) getSupportFragmentManager().findFragmentById(R.id.data_input);
        details = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.details);
        home = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.home);
        signup = (SignupFragment) getSupportFragmentManager().findFragmentById(R.id.signup);
        signin = (SigninFragment) getSupportFragmentManager().findFragmentById(R.id.signin);

        setContentView(R.layout.home);

    }
}
