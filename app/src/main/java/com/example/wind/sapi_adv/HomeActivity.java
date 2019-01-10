
package com.example.wind.sapi_adv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "HomeActivity";
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.sign_in_button).setOnClickListener(this);
        findViewById(R.id.sign_in_button2).setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();
        if (FirebaseUtil.getCurrentUserId() != null) {
            startActivity(new Intent(this, ProfileActivity.class));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.sign_in_button:
                startActivity(new Intent(this, PhoneAuthActivity.class));
                break;
            case R.id.sign_in_button2:
                startActivity(new Intent(this, SigninActivity.class));
                break;
        }
    }
}
