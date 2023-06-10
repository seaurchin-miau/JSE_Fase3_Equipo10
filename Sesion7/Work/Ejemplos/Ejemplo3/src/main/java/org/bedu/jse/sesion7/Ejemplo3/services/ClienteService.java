package org.bedu.jse.sesion7.Ejemplo3.services;

import lombok.RequiredArgsConstructor;
import org.bedu.jse.sesion7.Ejemplo3.model.Cliente;
import org.bedu.jse.sesion7.Ejemplo3.persistence.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente guardaCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> obtenCliente(Long clienteId) {
        return clienteRepository.findById(clienteId);
    }
}
