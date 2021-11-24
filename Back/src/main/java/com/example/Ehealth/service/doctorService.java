package com.example.Ehealth.service;

import com.example.Ehealth.model.doctor;
import com.example.Ehealth.repository.doctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class doctorService {
    @Autowired
    private  doctorRepository repo;

    //method that returns the doctor ,after registration
    //this method will be used in the doctorController

    public doctor saveDoctor(doctor doctor){
         return  repo.save(doctor);


    }

    //fetch a doctor by email
    public doctor fetchDoctorByEmail(String email){
      return   repo.findByEmail(email);

    }

    //fetch a doctor by email and password for the login
    public doctor fetchDoctorByEmailPassword(String email,String password){
        return repo.findByEmailAndPassword(email,password);
    }

}
