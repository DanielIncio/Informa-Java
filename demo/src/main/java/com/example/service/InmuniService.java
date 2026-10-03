package com.example.service;

import com.example.model.Inmuni;
import com.example.repository.InmuniRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InmuniService {
    
    @Autowired
    private InmuniRepository repo;
    
    public List<Inmuni> Listar(){
        return repo.findAll();
    }
    
    public Inmuni Guardar(Inmuni uni) {
        return repo.save(uni);
    }
    
    public void Eliminar(String mcodumed ){
        
        repo.deleteById(mcodumed);
        
    }
    
    public Inmuni Modificar(Inmuni modi){
        
        Optional<Inmuni> existente = repo.findById(modi.getMCODUMED());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Inmuni no encontrado");
        }
        
    
    }
    
}
