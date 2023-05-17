package com.example.proyectocapas.servicio;

import com.example.proyectocapas.modelo.Paciente;
import com.example.proyectocapas.repositorio.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacienteServicioImpl implements IPacienteServicio{
    @Autowired
    IPacienteRepo repo;
    @Override
    public String obtenerUno(Paciente paciente) {
        return repo.obtenerUno(paciente);
    }
}