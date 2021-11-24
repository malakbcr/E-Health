package com.example.Ehealth.model;

import javax.persistence.Entity;

@Entity
public class patient extends user{
    private String address;

    public patient() {
    }

    public patient(long user_id,
                   String first_name,
                   String last_name,
                   String email,
                   int tel_number,
                   String dob,
                   String password,
                   String address) {
        super(user_id,
                first_name,
                last_name,
                email,
                tel_number,
                dob,
                password);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
