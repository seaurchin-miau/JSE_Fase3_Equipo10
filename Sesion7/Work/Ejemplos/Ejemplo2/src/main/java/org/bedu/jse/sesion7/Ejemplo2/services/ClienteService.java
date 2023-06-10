package org.bedu.jse.sesion7.Ejemplo2.services;

import org.bedu.jse.sesion7.Ejemplo2.model.Cliente;

import java.util.Optional;

public class ClienteService {
    Cliente guardaCliente(Cliente cliente);

    Optional<Cliente> obtenCliente(Long clienteId);
}
