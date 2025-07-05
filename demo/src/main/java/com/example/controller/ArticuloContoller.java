package com.example.controller;
import com.example.model.Articulo;
import com.example.service.ArticuloService;
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
@RequestMapping("/api/articulo")
@CrossOrigin(origins = "http://localhost:4200")

public class ArticuloContoller { 

    
    
    @Autowired
    private ArticuloService servicio;
    
    @GetMapping
    public List<Articulo> listar (){ 
    return servicio.Listar();
    
    }
    
    @PostMapping
    public Articulo Guardar (@RequestBody Articulo art){
    System.out.println(art);
    //Articulo art=new Articulo();
    return servicio.Guardar(art);   
    }
    
    @DeleteMapping("/{mcodart}")
    public void Eliminar(@PathVariable String mcodart){
      servicio.Eliminar(mcodart);
    }
    
    @PutMapping()
    public Articulo Modificar(@RequestBody Articulo art){   

    return servicio.Modificar(art);
   }



}
  

