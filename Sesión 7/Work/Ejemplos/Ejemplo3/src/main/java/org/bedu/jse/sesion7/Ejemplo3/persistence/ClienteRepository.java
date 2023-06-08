package org.bedu.jse.sesion7.Ejemplo3.persistence;

import org.bedu.jse.sesion7.Ejemplo3.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClienteRepository {

    public Cliente save(Cliente cliente) {

        Cliente clienteDb = Cliente.builder()
                .id(1L)
                .nombre(cliente.getNombre())
                .correoContacto(cliente.getCorreoContacto())
                .direccion(cliente.getDireccion())
                .numeroEmpleados(cliente.getNumeroEmpleados())
                .build();

        return clienteDb;
    }

    public Optional<Cliente> findById(Long clienteId) {
        Cliente clienteDb = Cliente.builder()
                .id(clienteId)
                .nombre("Nombre del cliente")
                .correoContacto("correo@cliente.com")
                .direccion("Direccion del cliente")
                .numeroEmpleados(20)
                .build();

        return Optional.of(clienteDb);
    }
}