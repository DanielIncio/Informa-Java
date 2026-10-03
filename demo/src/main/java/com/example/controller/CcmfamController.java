package com.example.controller;

import com.example.model.Ccmfam;
import com.example.service.CcmfamService;
import java.util.List;
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
@RequestMapping("/api/ccmfam")
@CrossOrigin(origins = "http://localhost:4200")

public class CcmfamController {
    @Autowired
    private CcmfamService servicio;
    
    @GetMapping
    public List<Ccmfam> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmfam Guardar (@RequestBody Ccmfam fam){
    System.out.println(fam);
    return servicio.Guardar(fam);   
    }
    
    @DeleteMapping("/{mcodfam}")
    public void Eliminar(@PathVariable String mcodfam){
      servicio.Eliminar(mcodfam);
    }
    
    @PutMapping()
    public Ccmfam Modificar(@RequestBody Ccmfam fam){   

    return servicio.Modificar(fam);
   }
    
}
