package com.example.proyectocapas.repositorio;

import com.example.proyectocapas.modelo.Paciente;
import org.springframework.stereotype.Component;


public interface IPacienteRepo {

    String obtenerUno(Paciente paciente);
}
