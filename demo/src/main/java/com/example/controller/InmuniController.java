package com.example.controller;

import com.example.model.Inmuni;
import com.example.service.InmuniService;
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
@RequestMapping("/api/inmuni")
@CrossOrigin(origins = "http://localhost:4200")

public class InmuniController {
    
    @Autowired
    private InmuniService servicio;
    
    @GetMapping
    public List<Inmuni> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Inmuni Guardar (@RequestBody Inmuni uni){
    System.out.println(uni);
    //Inmuni uni=new Inmuni();
    return servicio.Guardar(uni);   
    }
    
    @DeleteMapping("/{mcodumed}")
    public void Eliminar(@PathVariable String mcodumed){
      servicio.Eliminar(mcodumed);
    }
    
    @PutMapping()
    public Inmuni Modificar(@RequestBody Inmuni uni){   

    return servicio.Modificar(uni);
   }
    
}
