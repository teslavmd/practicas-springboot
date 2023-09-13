package com.restaurantetodocode.demo.controladores;

import com.restaurantetodocode.demo.clases.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdontologiaController {
    
    
    //A)
    @GetMapping("/odontologia/pacientes")
    @ResponseBody
    public ResponseEntity<List<Paciente>> obtenerListaPacientes(){
        //CREAR LA LISTA DE PACIENTES
        List<Paciente> listaPaciente = new ArrayList<>();
        listaPaciente.add(new Paciente(1, 41234667, "Matias", "Villafañe", LocalDate.of(2003, 1, 15)));
        listaPaciente.add(new Paciente(2, 23344567, "Belén", "Perea", LocalDate.of(2002, 5, 13)));
        listaPaciente.add(new Paciente(3, 43344667, "Lionel", "Peréz", LocalDate.of(2001, 10, 11)));
        listaPaciente.add(new Paciente(4, 53312667, "Karen", "Lopez", LocalDate.of(2002, 12, 23)));
        listaPaciente.add(new Paciente(5, 23345123, "Roman", "Riquelme", LocalDate.of(2007, 7, 7)));
       
        
        if(listaPaciente != null){
            return new ResponseEntity<>(listaPaciente, HttpStatus.OK); 
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        
    }
    
    
    @GetMapping("/odontologia/pacientes/menores")
    @ResponseBody
    public ResponseEntity<List<Paciente>> pacientesMenores(){
        List<Paciente> listaPaciente = new ArrayList<>();
        listaPaciente.add(new Paciente(1, 41234667, "Matias", "Villafañe", LocalDate.of(2003, 1, 15)));
        listaPaciente.add(new Paciente(2, 23344567, "Belén", "Perez", LocalDate.of(2002, 5, 13)));
        listaPaciente.add(new Paciente(3, 43344667, "Juan", "Peréz", LocalDate.of(2010, 10, 11)));
        listaPaciente.add(new Paciente(4, 53312667, "Karen", "Lopez", LocalDate.of(2002, 12, 23)));
        listaPaciente.add(new Paciente(5, 23345123, "Roman", "Riquelme", LocalDate.of(2007, 7, 7)));
       
        LocalDate fechaHoy = LocalDate.now();
        List<Paciente> listaMenores = new ArrayList<>();
        
        
        for(Paciente paciente : listaPaciente){
            if(Period.between(paciente.getFechaNac(), fechaHoy).getYears() < 18){
                listaMenores.add(paciente);
            }
        }
        
        if(listaMenores != null){
            return new ResponseEntity<>(listaMenores, HttpStatus.OK);
        }
        
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        
    }
    
    
}
