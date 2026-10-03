package com.example.service;

import com.example.model.Ccmtip;
import com.example.repository.CcmtipRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcmtipService {
    
    @Autowired
    private CcmtipRepository repo;
    
    public List<Ccmtip> Listar(){
        return repo.findAll();
    }
    
    public Ccmtip Guardar(Ccmtip tip) {
        return repo.save(tip);
    }
    
    public void Eliminar(String mtipotran ){
        
        repo.deleteById(mtipotran);
        
    }
    
    public Ccmtip Modificar(Ccmtip modi){
        
        Optional<Ccmtip> existente = repo.findById(modi.getMTIPOTRAN());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Ccmtip no encontrado");
        }
        
    
    }
    
}
