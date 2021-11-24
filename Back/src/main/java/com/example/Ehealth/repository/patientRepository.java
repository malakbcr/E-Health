package com.example.Ehealth.repository;

import com.example.Ehealth.model.patient;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepository extends userRepository {
    public patient findPatientByemail(String emailId);
    public patient findPatientByEmailAndPassword(String emailId, String password);
}
