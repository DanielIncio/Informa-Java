package com.example.service;

import com.example.model.Ccmtrs;
import com.example.repository.CcmtrsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcmtrsService {
    
    @Autowired
    private CcmtrsRepository repo;
    
    public List<Ccmtrs> Listar(){
        return repo.findAll();
    }
    
    public Ccmtrs Guardar(Ccmtrs trs) {
        return repo.save(trs);
    }
    
    public void Eliminar(String mcodtrsp ){
        
        repo.deleteById(mcodtrsp);
        
    }
    
    public Ccmtrs Modificar(Ccmtrs modi){
        
        Optional<Ccmtrs> existente = repo.findById(modi.getMCODTRSP());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Ccmtrs no encontrado");
        }
        
    
    }
     
}
