package com.example.controller;

import com.example.model.Ccmtrs;
import com.example.service.CcmtrsService;
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
@RequestMapping("/api/ccmtrs")
@CrossOrigin(origins = "http://localhost:4200")

public class CcmtrsController {
    
    @Autowired
    private CcmtrsService servicio;
    
    @GetMapping
    public List<Ccmtrs> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmtrs Guardar (@RequestBody Ccmtrs trs){
    System.out.println(trs);
    //Ccmtrs trs=new Ccmtrs();
    return servicio.Guardar(trs);   
    }
    
    @DeleteMapping("/{mcodtrsp}")
    public void Eliminar(@PathVariable String mcodtrsp){
      servicio.Eliminar(mcodtrsp);
    }
    
    @PutMapping()
    public Ccmtrs Modificar(@RequestBody Ccmtrs trs){   

    return servicio.Modificar(trs);
   }
    
}
