package com.example.wind.sapi_adv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<Contact> contacts = new ArrayList<>();
    private ContactAdapter adapter;
    private Button addBut;
    private final String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBut = findViewById(R.id.bt_add);
        addBut.setOnClickListener(this);

        ListView lvContacts = (ListView) findViewById(R.id.lv_contacts);
        adapter = new ContactAdapter(this, contacts);
        lvContacts.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, DataInputActivity.class);
        startActivityForResult(intent, 0);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0) {
            if (resultCode == 1) {
                try {
                    Contact c = (Contact)data.getSerializableExtra("CONT");
                    contacts.add(c);
                } catch (Exception e) {
                    Log.d(TAG, "onActivityResult: conatct null");
                }

                adapter.notifyDataSetChanged();
            }
        }
    }
}
