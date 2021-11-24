package com.example.Ehealth.controller;

import com.example.Ehealth.model.doctor;
import com.example.Ehealth.model.patient;
import com.example.Ehealth.service.doctorService;
import com.example.Ehealth.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientController {
    @Autowired
    private patientService service;


    @PostMapping("/registerPatient")
    @CrossOrigin(origins = "http://localhost:4200")
    //this method will be used when a doctor register (path)
    public patient registerPatient(@RequestBody patient patient) throws Exception{

        //before sending to the database we should do some tests,check if doctor already exists
        String emailId = patient.getEmail();
        if(emailId!=null && !"".equals(emailId)){
            patient patientObj = service.fetchPatientByEmail(emailId);
            if (patientObj!=null){
                throw new Exception("user with this email already exists");
            }

        }

        patient patientObj = null;
        patientObj = service.savePatient(patient);
        return patientObj;

    }
    @PostMapping("/loginPatient")
    @CrossOrigin(origins = "http://localhost:4200")
    public patient loginPatient(@RequestBody patient patient) throws Exception{
        String emailId =patient.getEmail();
        String password = patient.getPassword();
        patient patientObj = null;
        if(emailId!=null && password!=null){
            patientObj= service.fetchPatientByEmailPassword(emailId,password);
        }
        if(patientObj == null){
            throw new Exception("Bad credentials");
        }
        return patientObj;

    }

}
