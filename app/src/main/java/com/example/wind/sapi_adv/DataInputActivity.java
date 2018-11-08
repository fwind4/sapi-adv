package com.example.wind.sapi_adv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataInputActivity extends AppCompatActivity implements View.OnClickListener {

    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datainput);
        but = findViewById(R.id.bt_add);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText name = findViewById(R.id.et_name);
        EditText phone = findViewById(R.id.et_phone);
        Contact contact = new Contact(name.getText().toString(), phone.getText().toString());
        Intent intent = new Intent(this, DataInputActivity.class);
        intent.putExtra("CONT", contact);
        setResult(1, intent);
        finish();
    }
}
