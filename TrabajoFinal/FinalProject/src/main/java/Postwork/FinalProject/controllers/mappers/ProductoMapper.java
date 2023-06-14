package Postwork.FinalProject.controller.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(Postwork.FinalProject.model.Producto productoModel);

    Postwork.FinalProject.model.Producto productoEntityToProductoModel(Producto producto);
}
