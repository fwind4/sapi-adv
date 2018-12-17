package com.example.wind.sapi_adv;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public ListingFragment listing;
    public DataInputFragment dataInput;
    public DetailsFragment details;
    public HomeFragment home;
    public ProfileFragment profile;
    public VerifyPhoneFragment verifyphone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.home);
        profile = (ProfileFragment) getSupportFragmentManager().findFragmentById(R.id.profile);
        verifyphone = (VerifyPhoneFragment) getSupportFragmentManager().findFragmentById(R.id.verifyphone);
        listing = (ListingFragment) getSupportFragmentManager().findFragmentById(R.id.list);
        dataInput = (DataInputFragment) getSupportFragmentManager().findFragmentById(R.id.data_input);
        details = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.details);

        //setContentView(R.layout.listing);

    }

}
