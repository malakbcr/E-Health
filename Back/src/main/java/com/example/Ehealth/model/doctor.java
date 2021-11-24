package com.example.Ehealth.model;

import javax.persistence.Entity;

@Entity
public class doctor extends user {
    private String specialty;
    private String office_address;
    private int visit_price;
    private String work_schedule;

    public doctor() {
    }

    public doctor(long user_id,
                  String first_name,
                  String last_name,
                  String email,
                  int tel_number,
                  String dob,
                  String password,
                  String specialty,
                  String office_address,
                  int visit_price,
                  String work_schedule) {
        super(user_id,
                first_name,
                last_name,
                email,
                tel_number,
                dob,
                password);
        this.specialty = specialty;
        this.office_address=office_address;
        this.visit_price=visit_price;
        this.work_schedule=work_schedule;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getOffice_address() {
        return office_address;
    }

    public void setOffice_address(String office_address) {
        this.office_address = office_address;
    }

    public int getVisit_price() {
        return visit_price;
    }

    public void setVisit_price(int visit_price) {
        this.visit_price = visit_price;
    }

    public String getWork_schedule() {
        return work_schedule;
    }

    public void setWork_schedule(String work_schedule) {
        this.work_schedule = work_schedule;
    }
}
