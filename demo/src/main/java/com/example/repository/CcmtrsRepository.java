package com.example.repository;

import com.example.model.Ccmtrs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcmtrsRepository extends JpaRepository<Ccmtrs,String>{
    
}
