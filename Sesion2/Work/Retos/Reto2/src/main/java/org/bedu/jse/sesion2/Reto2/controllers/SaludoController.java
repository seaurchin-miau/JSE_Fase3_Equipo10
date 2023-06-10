package org.bedu.jse.sesion2.Reto2.controllers;

import org.bedu.jse.sesion2.Reto2.model.Saludo;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @PutMapping ("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo){
        return saludo;
    }
}
