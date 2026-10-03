package com.example.controller;

import com.example.model.Ccmven;
import com.example.service.CcmvenService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ccmven")
@CrossOrigin(origins = "http://localhost:4200")


public class CcmvenController {
    
    @Autowired
    private CcmvenService servicio;
    
    @GetMapping
    public List<Ccmven> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmven Guardar (@RequestBody Ccmven ven){
    System.out.println(ven);
    //Ccmven ven=new Ccmven();
    return servicio.Guardar(ven);   
    }
    
    @DeleteMapping("/{mcodven}")
    public void Eliminar(@PathVariable String mcodven){
      servicio.Eliminar(mcodven);
    }
    
    @PutMapping()
    public Ccmven Modificar(@RequestBody Ccmven ven){   

    return servicio.Modificar(ven);
   }
    
}
