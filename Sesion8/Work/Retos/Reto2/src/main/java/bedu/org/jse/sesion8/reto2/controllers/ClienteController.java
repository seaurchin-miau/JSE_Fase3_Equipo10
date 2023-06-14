package bedu.org.jse.sesion8.reto2.controllers;

import bedu.org.jse.sesion8.reto2.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping
    public ResponseEntity<Void> creaCliente(@Validated @RequestBody Cliente cliente){
        return ResponseEntity.created(URI.create("1")).build();
    }
}