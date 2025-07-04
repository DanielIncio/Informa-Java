package com.example.repository;

import com.example.model.Ccmtpt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcmtptRepository extends JpaRepository<Ccmtpt,String>{
    
}
