package org.bedu.jse.sesion5.ejemplo2.dtos.mappings;

import org.bedu.jse.sesion5.ejemplo2.dtos.ClienteDto;
import org.bedu.jse.sesion5.ejemplo2.model.Cliente;

@Mapper
public interface ClienteMapper {
    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    ClienteDto clienteToClienteDto(Cliente cliente);
}
