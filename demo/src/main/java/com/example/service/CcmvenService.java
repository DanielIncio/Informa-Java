package com.example.service;

import com.example.model.Ccmven;
import com.example.repository.CcmvenRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CcmvenService {
    
    @Autowired
    private CcmvenRepository repo;
    
    public List<Ccmven> Listar(){
        return repo.findAll();
    }
    
    public Ccmven Guardar(Ccmven ven) {
        return repo.save(ven);
    }
    
    public void Eliminar(String mcodven ){
        
        repo.deleteById(mcodven);
        
    }
    
    public Ccmven Modificar(Ccmven modi){
        
        Optional<Ccmven> existente = repo.findById(modi.getMCODVEN());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Ccmven no encontrado");
        }
        
    
    }
    
}
