package bedu.org.jse.sesion8.ejemplo1.controllers;

import bedu.org.jse.sesion8.ejemplo1.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long clienteId){
        return ResponseEntity.ok(Cliente.builder().id(1L).correoContacto("cliente@contacto.com").nombre("Nombre").build());
    }
}