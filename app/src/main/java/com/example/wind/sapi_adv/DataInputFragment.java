package com.example.wind.sapi_adv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataInputFragment extends Fragment implements View.OnClickListener {

    private Button but;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setContentView(R.layout.datainput);
        but = getActivity().findViewById(R.id.bt_add);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText name = getActivity().findViewById(R.id.et_name);
        EditText phone = getActivity().findViewById(R.id.et_phone);
        Contact contact = new Contact(name.getText().toString(), phone.getText().toString());
        Intent intent = new Intent(getActivity(), DataInputFragment.class);
        intent.putExtra("CONT", contact);
        getActivity().setResult(1, intent);
        getActivity().finish();
    }
}
