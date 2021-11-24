package com.example.Ehealth.model;

import javax.persistence.Entity;

@Entity
public class pharmacist extends user {
    private String ph_address;
    private String schedule;

    public pharmacist() {
    }

    public pharmacist(long user_id,
                      String first_name,
                      String last_name,
                      String email,
                      int tel_number,
                      String dob,
                      String password,
                      String ph_address,
                      String schedule) {
        super(user_id,
                first_name,
                last_name,
                email,
                tel_number,
                dob,
                password);
        this.ph_address = ph_address;
        this.schedule = schedule;
    }

    public String getPh_address() {
        return ph_address;
    }

    public void setPh_address(String ph_address) {
        this.ph_address = ph_address;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
