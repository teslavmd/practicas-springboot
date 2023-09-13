package com.restaurantetodocode.demo.Servicios;

import com.restaurantetodocode.demo.clases.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FakeBDService {
    
    public List<Paciente> obtenerPacientes(){
        
        List<Paciente> listaPaciente = new ArrayList<>();
        listaPaciente.add(new Paciente(1, 41234667, "Matias", "Villafañe", LocalDate.of(2003, 1, 15)));
        listaPaciente.add(new Paciente(2, 23344567, "Belén", "Perea", LocalDate.of(2002, 5, 13)));
        listaPaciente.add(new Paciente(3, 43344667, "Juan", "Peréz", LocalDate.of(2001, 10, 11)));
        listaPaciente.add(new Paciente(4, 53312667, "Karen", "Lopez", LocalDate.of(2002, 12, 23)));
        listaPaciente.add(new Paciente(5, 23345123, "Roman", "Riquelme", LocalDate.of(2007, 7, 7)));
       
        
        return listaPaciente;
    }
    
    
}
