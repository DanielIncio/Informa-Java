package com.example.service;
import com.example.model.Ccmtpt;
import com.example.repository.CcmtptRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcmtptService {
    
   @Autowired
    private CcmtptRepository repo;
    
    public List<Ccmtpt> Listar(){
        return repo.findAll();
    }
    
    public Ccmtpt Guardar(Ccmtpt tpt) {
        return repo.save(tpt);
    }
    
    public void Eliminar(String mcodtpt ){
        
        repo.deleteById(mcodtpt);
        
    }
    
    public Ccmtpt Modificar(Ccmtpt modi){
        
        Optional<Ccmtpt> existente = repo.findById(modi.getMCODTPT());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Tipo producto no encontrado");
        }
        
    
    }
    
}
