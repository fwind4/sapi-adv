package com.example.wind.sapi_adv;

public class Contact implements java.io.Serializable {
    private String name;
    private String phone;


    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
