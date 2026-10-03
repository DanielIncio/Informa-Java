package com.example.service;

import com.example.model.Cpmcos;
import com.example.repository.CpmcosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CpmcosService {
    
    @Autowired
    private CpmcosRepository repo;
    
    public List<Cpmcos> Listar(){
        return repo.findAll();
    }
    
    public Cpmcos Guardar(Cpmcos cos) {
        return repo.save(cos);
    }
    
    public void Eliminar(String mcodcos ){
        
        repo.deleteById(mcodcos);
        
    }
    
    public Cpmcos Modificar(Cpmcos modi){
        
        Optional<Cpmcos> existente = repo.findById(modi.getMCODCOS());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Cpmcos no encontrado");
        }
        
    
    }
    
}
