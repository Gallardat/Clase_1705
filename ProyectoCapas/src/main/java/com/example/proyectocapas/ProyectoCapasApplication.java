package com.example.proyectocapas;

import com.example.proyectocapas.controlador.PacienteControlador;
import com.example.proyectocapas.modelo.Paciente;
import com.example.proyectocapas.repositorio.PacienteRepoImpl;
import com.example.proyectocapas.servicio.PacienteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoCapasApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoCapasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
