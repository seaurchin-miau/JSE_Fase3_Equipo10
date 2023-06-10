package org.bedu.jse.sesion5.Ejemplo3.controllers;

import org.bedu.jse.sesion5.Ejemplo3.dtos.ClienteDto;
import org.bedu.jse.sesion5.Ejemplo3.model.Cliente;
import org.bedu.jse.sesion5.Ejemplo3.model.mappings.ClienteMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteCntroller {

    private final ClienteMapper mapper;

    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){

        ClienteDto clienteDto = mapper.clienteToClienteDto(cliente);

        System.out.println(clienteDto);

        return ResponseEntity.created(URI.create("1")).build();
    }
}
