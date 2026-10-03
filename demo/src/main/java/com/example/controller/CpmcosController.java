package com.example.controller;

import com.example.model.Cpmcos;
import com.example.service.CpmcosService;
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
@RequestMapping("/api/cpmcos")
@CrossOrigin(origins = "http://localhost:4200")

public class CpmcosController {
    
    @Autowired
    private CpmcosService servicio;
    
    @GetMapping
    public List<Cpmcos> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Cpmcos Guardar (@RequestBody Cpmcos cos){
    System.out.println(cos);
    //Cpmcos cos=new Cpmcos();
    return servicio.Guardar(cos);   
    }
    
    @DeleteMapping("/{mcodcos}")
    public void Eliminar(@PathVariable String mcodcos){
      servicio.Eliminar(mcodcos);
    }
    
    @PutMapping()
    public Cpmcos Modificar(@RequestBody Cpmcos cos){   

    return servicio.Modificar(cos);
   }
    
}
