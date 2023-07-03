package com.example.ec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IDATController {

    @GetMapping("/")
    public String mostrarCodigoYNombre() {
        String codigoIDAT = "PT76534813"; 
        String nombre = "Ray Vargas"; 

        return codigoIDAT + " - " + nombre;
    }

    @GetMapping("/idat/codigo")
    public String mostrarCodigoIDAT() {
        String codigoIDAT = "PT76534813"; 

        return codigoIDAT;
    }

    @GetMapping("/idat/nombre-completo")
    public String mostrarNombreCompleto() {
        String nombreCompleto = "TU_NOMBRE_COMPLETO";

        return nombreCompleto;
    }
}
