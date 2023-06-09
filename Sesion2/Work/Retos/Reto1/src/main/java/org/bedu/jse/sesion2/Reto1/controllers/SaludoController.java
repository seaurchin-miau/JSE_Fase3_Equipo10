package org.bedu.jse.sesion2.Reto1.controllers;

import org.bedu.jse.sesion2.Reto1.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo/{nombre}")
    public Saludo saluda(@PathVariable String nombre){

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");
        saludo.setNombre(nombre);

        return saludo;
    }
}
