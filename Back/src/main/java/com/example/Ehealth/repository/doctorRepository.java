package com.example.Ehealth.repository;

import com.example.Ehealth.model.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepository extends userRepository  {
    public doctor findByEmail(String emailId);
    public doctor findByEmailAndPassword(String emailId,String password);
}
