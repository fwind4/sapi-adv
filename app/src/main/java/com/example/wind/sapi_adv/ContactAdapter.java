package com.example.wind.sapi_adv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    private List<Contact> objects;
    private final Context context;
    public ContactAdapter(Context context, List<Contact> objects) {
        super(context, R.layout.phonebook_item, objects);
        this.context = context;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.phonebook_item, parent,
                false);
        TextView tvName = (TextView) rowView.findViewById(R.id.tv_name);
        TextView tvPhone = (TextView) rowView.findViewById(R.id.tv_phone);
        tvName.setText(objects.get(position).getName());
        tvPhone.setText(objects.get(position).getPhone());
        return rowView;
    }
}