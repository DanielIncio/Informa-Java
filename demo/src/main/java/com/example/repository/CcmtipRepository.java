package com.example.repository;

import com.example.model.Ccmtip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface CcmtipRepository extends JpaRepository<Ccmtip,String>{
    
}
