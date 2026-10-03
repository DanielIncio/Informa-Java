package com.example.service;

import com.example.model.Ccmalm;
import com.example.repository.CcmalmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CcmalmService {
    @Autowired
    private CcmalmRepository repo;
    
    public List<Ccmalm> Listar(){
        return repo.findAll();
    }
    
    public Ccmalm Guardar(Ccmalm alm) {
        return repo.save(alm);
    }
    
    public void Eliminar(String mcodalm ){
        
        repo.deleteById(mcodalm);
        
    }
    
    public Ccmalm Modificar(Ccmalm modi){
        
        Optional<Ccmalm> existente = repo.findById(modi.getMCODALM());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Ccmalm no encontrado");
        }
        
    
    }
    
}
