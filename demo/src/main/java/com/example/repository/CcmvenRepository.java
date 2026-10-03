package com.example.repository;

import com.example.model.Ccmven;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcmvenRepository extends JpaRepository<Ccmven,String> {
    
}
