package com.example.wind.sapi_adv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListingFragment listing;
    private DataInputFragment dataInput;
    private DetailsFragment details;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listing = (ListingFragment) getSupportFragmentManager().findFragmentById(R.id.list);
        dataInput = (DataInputFragment) getSupportFragmentManager().findFragmentById(R.id.data_input);
        details = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.details);

        setContentView(R.layout.listing);

    }
}
