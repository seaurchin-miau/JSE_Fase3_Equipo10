package org.bedu.jse.sesion6.Ejemplo1.controllers;

import lombok.RequiredArgsConstructor;
import org.bedu.jse.sesion6.Ejemplo1.model.Cliente;
import org.bedu.jse.sesion6.Ejemplo1.persistence.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){
        Cliente clienteDB = clienteRepository.save(cliente);

        return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();

    }

    private final ClienteRepository clienteRepository;
}
