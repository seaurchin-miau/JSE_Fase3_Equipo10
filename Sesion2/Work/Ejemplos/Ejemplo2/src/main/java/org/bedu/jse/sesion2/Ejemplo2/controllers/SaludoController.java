package org.bedu.jse.sesion2.Ejemplo2.controllers;

import org.bedu.jse.sesion2.Ejemplo2.model.Saludo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @PostMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo){
        return saludo;
    }
}
