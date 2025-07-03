package com.example.demo.repository;
import com.example.demo.model.Ccmfam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcmfamRepository extends JpaRepository<Ccmfam,String> {
    
}
