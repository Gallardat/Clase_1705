package com.example.proyectocapas.repositorio;

import com.example.proyectocapas.modelo.Paciente;
import org.springframework.stereotype.Component;


@Component
public class PacienteRepoImpl implements IPacienteRepo {
    @Override
    public String obtenerUno(Paciente paciente) {
        return paciente.toString();
    }
}
