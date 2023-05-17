package com.example.proyectocapas.controlador;

import com.example.proyectocapas.modelo.Paciente;
import com.example.proyectocapas.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    IPacienteServicio servicio;


    @GetMapping()
     String obtenerUno(){
        Paciente paciente= new Paciente(1,"Daniela",29);
        return servicio.obtenerUno(paciente);

    }

}
