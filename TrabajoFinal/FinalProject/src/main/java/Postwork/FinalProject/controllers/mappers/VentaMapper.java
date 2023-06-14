package Postwork.FinalProject.controller.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    Venta ventaModelToVentaEntity(Postwork.FinalProject.model.Venta ventaModel);

    Postwork.FinalProject.model.Venta ventaEntityToVentaModel(Venta venta);
}
