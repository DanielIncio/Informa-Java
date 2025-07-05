package com.example.service;

import com.example.model.Ccmcla;
import com.example.repository.CcmclaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CcmclaService {
    
    @Autowired
    private CcmclaRepository repo;
    
    public List<Ccmcla> Listar(){
        return repo.findAll();
    }
    
    public Ccmcla Guardar(Ccmcla cla) {
        return repo.save(cla);
    }
    
    public void Eliminar(String mcodcla ){
        
        repo.deleteById(mcodcla);
        
    }
    
    public Ccmcla Modificar(Ccmcla modi){
        
        Optional<Ccmcla> existente = repo.findById(modi.getMCODCLA());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("clase no encontrada");
        }
        
    
    }
    
}
