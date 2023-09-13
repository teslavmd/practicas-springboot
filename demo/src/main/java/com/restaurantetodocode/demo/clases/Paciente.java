package com.restaurantetodocode.demo.clases;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Paciente {
    
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    public Paciente() {
    }

    public Paciente(int id, int dni, String nombre, String apellido, LocalDate fechaNac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
    
    
    
}
