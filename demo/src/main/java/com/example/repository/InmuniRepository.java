package com.example.repository;

import com.example.model.Inmuni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuniRepository extends JpaRepository<Inmuni,String>{
    
}
