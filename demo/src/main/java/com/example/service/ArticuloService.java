package com.example.service;
import com.example.model.Articulo;
import com.example.repository.ArticuloRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ArticuloService {
    
    @Autowired
    private ArticuloRepository repo;
    
    public List<Articulo> Listar(){
        return repo.findAll();
    }
    
    public Articulo Guardar(Articulo art) {
        return repo.save(art);
    }
    
    public void Eliminar(String mcodart ){
        
        repo.deleteById(mcodart);
        
    }
    
    public Articulo Modificar(Articulo modi){
        
        Optional<Articulo> existente = repo.findById(modi.getMCODART());
        if(existente.isPresent()){
            
            return repo.save(modi);
        }
        else {
            
            throw new RuntimeException("Articulo no encontrado");
        }
        
    
    }
    
}



