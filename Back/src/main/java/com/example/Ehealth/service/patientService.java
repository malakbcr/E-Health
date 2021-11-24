package com.example.Ehealth.service;

import com.example.Ehealth.model.patient;
import com.example.Ehealth.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class patientService {
    @Autowired
    private patientRepository repo;



    public patient savePatient(patient patient){

        return  repo.save(patient);


    }


    public patient fetchPatientByEmail(String email){
        return   repo.findPatientByemail(email);

    }


    public patient fetchPatientByEmailPassword(String email,String password){
        return repo.findPatientByEmailAndPassword(email,password);
    }

}
