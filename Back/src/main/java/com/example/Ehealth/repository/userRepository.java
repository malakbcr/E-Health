package com.example.Ehealth.repository;
import com.example.Ehealth.model.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;



@NoRepositoryBean
public interface userRepository extends JpaRepository<user,Long> {

}
