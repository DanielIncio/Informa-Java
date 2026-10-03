package com.example.controller;

import com.example.model.Ccmtip;
import com.example.service.CcmtipService;
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
@RequestMapping("/api/ccmtip")
@CrossOrigin(origins = "http://localhost:4200")

public class CcmtipController {
    
    @Autowired
    private CcmtipService servicio;
    
    @GetMapping
    public List<Ccmtip> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmtip Guardar (@RequestBody Ccmtip tip){
    System.out.println(tip);
    //Ccmtip tip=new Ccmtip();
    return servicio.Guardar(tip);   
    }
    
    @DeleteMapping("/{mtipotran}")
    public void Eliminar(@PathVariable String mtipotran){
      servicio.Eliminar(mtipotran);
    }
    
    @PutMapping()
    public Ccmtip Modificar(@RequestBody Ccmtip tip){   

    return servicio.Modificar(tip);
   }

    
}
