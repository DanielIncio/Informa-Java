package com.example.controller;

import com.example.model.Ccmalm;
import com.example.service.CcmalmService;
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
@RequestMapping("/api/ccmalm")
@CrossOrigin(origins = "http://localhost:4200")

public class CcmalmController {
    
    @Autowired
    private CcmalmService servicio;
    
    @GetMapping
    public List<Ccmalm> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmalm Guardar (@RequestBody Ccmalm alm){
    System.out.println(alm);
    //Ccmalm alm=new Ccmalm();
    return servicio.Guardar(alm);   
    }
    
    @DeleteMapping("/{mcodalm}")
    public void Eliminar(@PathVariable String mcodalm){
      servicio.Eliminar(mcodalm);
    }
    
    @PutMapping()
    public Ccmalm Modificar(@RequestBody Ccmalm alm){   

    return servicio.Modificar(alm);
   }
    
}
