package com.example.service;
import com.example.model.Ccmfam;
import com.example.repository.CcmfamRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcmfamService {
    @Autowired
    private CcmfamRepository repo;
    
    public List<Ccmfam> Listar(){
        return repo.findAll();
    }
    
    public Ccmfam Guardar(Ccmfam fam) {
        return repo.save(fam);
    }
    
    public void Eliminar(String mcodfam ){
        
        repo.deleteById(mcodfam);
        
    }
    
    public Ccmfam Modificar(Ccmfam modi){
        
        Optional<Ccmfam> existente = repo.findById(modi.getMCODFAM());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("familia no encontrada");
        }
        
    
    }
    
}
