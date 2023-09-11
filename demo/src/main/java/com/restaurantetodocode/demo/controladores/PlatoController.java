package com.restaurantetodocode.demo.controladores;

import com.restaurantetodocode.demo.clases.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlatoController {
    
    @GetMapping("/plato/{numPlato}")
    public ResponseEntity<Plato> consultarPlato(@PathVariable int numPlato){
        List<Plato> listaPlatos = new ArrayList<>();
        listaPlatos.add(new Plato(1, "Ramen", 6000.0, "Plato originario de Japón"));
        listaPlatos.add(new Plato(2, "Spaghetti", 3000.0, "Pasta tradicional Italiana (Fideos con tuco)"));
        listaPlatos.add(new Plato(3, "Tacos", 600.0, "c/u; Comida tradicional mexicana con variedad de sabores"));
        listaPlatos.add(new Plato(4, "Puchero", 3500.0, "Plato comunmente comido en el noroeste Argentino, que consiste en osobuco, papas, zapallo y acelga muy rico, para antes de tomarte una sopita"));
        listaPlatos.add(new Plato(5, "Estofado", 2000.0, "Combinacion de Papas y Zanahorias conrtadas en cubito acompañado de un poco de carne todo esto hervido en conjunto con salsa de tomate y otras especias"));
        
        Plato platoToReturn = new Plato();
        
        for(Plato plato : listaPlatos){
            if(plato.getNumPlato() == numPlato){
                platoToReturn = plato;
                return new ResponseEntity<>(platoToReturn, HttpStatus.OK);
            }
        }
      
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
    }
    
    
}
