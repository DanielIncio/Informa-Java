package com.example.controller;
import com.example.model.Ccmcla;
import com.example.service.CcmclaService;
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
@RequestMapping("/api/ccmcla")
@CrossOrigin(origins = "http://localhost:4200")

public class CcmclaController {
    @Autowired
    private CcmclaService servicio;
    
    @GetMapping
    public List<Ccmcla> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Ccmcla Guardar (@RequestBody Ccmcla cla){
    System.out.println(cla);
    //Articulo art=new Articulo();
    return servicio.Guardar(cla);   
    }
    
    @DeleteMapping("/{mcodcla}")
    public void Eliminar(@PathVariable String mcodcla){
      servicio.Eliminar(mcodcla);
    }
    
    @PutMapping()
    public Ccmcla Modificar(@RequestBody Ccmcla cla){   

    return servicio.Modificar(cla);
   }
    
    
}
