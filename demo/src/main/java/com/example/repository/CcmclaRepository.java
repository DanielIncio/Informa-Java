package com.example.repository;

import com.example.model.Ccmcla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CcmclaRepository extends JpaRepository<Ccmcla,String> {
    
}
