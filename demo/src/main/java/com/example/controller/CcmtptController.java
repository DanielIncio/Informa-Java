package com.example.controller;

import com.example.model.Ccmtpt;
import com.example.service.CcmtptService;
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
@RequestMapping("/api/ccmtpt")
@CrossOrigin(origins = "http://localhost:4200")


public class CcmtptController {
    @Autowired
    private CcmtptService servicio;
    
    @GetMapping
    public List<Ccmtpt> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmtpt Guardar (@RequestBody Ccmtpt tpt){
    System.out.println(tpt);
    return servicio.Guardar(tpt);   
    }
    
    @DeleteMapping("/{mcodtpt}")
    public void Eliminar(@PathVariable String mcodtpt){
      servicio.Eliminar(mcodtpt);
    }
    
    @PutMapping()
    public Ccmtpt Modificar(@RequestBody Ccmtpt tpt){   

    return servicio.Modificar(tpt);
   }
    
}
