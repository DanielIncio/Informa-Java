package com.example.repository;

import com.example.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ArticuloRepository extends JpaRepository<Articulo,String>{


    
}
