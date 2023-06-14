package Postwork.FinalProject.controller.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente clienteModelToClienteEntity(Postwork.FinalProject.model.Cliente clienteModel);

    Postwork.FinalProject.model.Cliente clienteEntityToClienteModel(Cliente cliente);
}
