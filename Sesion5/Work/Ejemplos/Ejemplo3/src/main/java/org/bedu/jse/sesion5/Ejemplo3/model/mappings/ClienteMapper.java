package org.bedu.jse.sesion5.Ejemplo3.model.mappings;

import org.bedu.jse.sesion5.Ejemplo3.dtos.ClienteDto;
import org.bedu.jse.sesion5.Ejemplo3.model.Cliente;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface ClienteMapper {

    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    ClienteDto clienteToClienteDto(Cliente cliente);
}
