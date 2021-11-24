package com.example.Ehealth.controller;

import com.example.Ehealth.model.doctor;
import com.example.Ehealth.service.doctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class doctorController {

    @Autowired
    private doctorService service;

   @PostMapping ("/registerDoctor")
   @CrossOrigin(origins = "http://localhost:4200")
   //this method will be used when a doctor register (path)
    public doctor registerDoctor(@RequestBody doctor doctor) throws Exception{

       //before sending to the database we should do some tests,check if doctor already exists
       String emailId = doctor.getEmail();
       if(emailId!=null && !"".equals(emailId)){
           doctor doctorObj = service.fetchDoctorByEmail(emailId);
           if (doctorObj!=null){
               throw new Exception("user with this email already exists");
           }

       }

        doctor docObj = null;
        docObj = service.saveDoctor(doctor);
        return docObj;

    }
    @PostMapping("/loginDoctor")
    @CrossOrigin(origins = "http://localhost:4200")
    public doctor loginDoctor(@RequestBody doctor doctor) throws Exception{
       String emailId =doctor.getEmail();
       String password = doctor.getPassword();
       doctor docObj = null;
       if(emailId!=null && password!=null){
          docObj= service.fetchDoctorByEmailPassword(emailId,password);
       }
       if(docObj == null){
           throw new Exception("Bad credentials");
       }
       return docObj;

    }

}
