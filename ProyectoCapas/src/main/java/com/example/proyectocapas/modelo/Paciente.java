package com.example.proyectocapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paciente {
    private int idPaciente;
    private  String nombre;
    private int edad;

public String toString() {
     return "El paciente " + this.nombre + " tiene " + this.edad + " años";
}
}
