package com.example.wind.sapi_adv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListingFragment extends Fragment {

    private List<Contact> contacts = new ArrayList<>();
    private ContactAdapter adapter;
    private Button addBut;
    private final String TAG = "MAIN_ACTIVITY";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
        addBut = getActivity().findViewById(R.id.bt_add);
        addBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DataInputFragment.class);
                startActivityForResult(intent, 0);
            }
        });

        ListView lvContacts = (ListView) getActivity().findViewById(R.id.lv_contacts);
        adapter = new ContactAdapter(getActivity(), contacts);
        lvContacts.setAdapter(adapter);

        return inflater.inflate(R.layout.listing, container, false);
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
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
