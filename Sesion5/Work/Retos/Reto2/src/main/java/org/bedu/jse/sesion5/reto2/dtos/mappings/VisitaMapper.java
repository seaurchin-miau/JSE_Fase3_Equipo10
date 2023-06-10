package org.bedu.jse.sesion5.reto2.dtos.mappings;

import org.bedu.jse.sesion5.reto2.dtos.VisitaDto;
import org.bedu.jse.sesion5.reto2.model.Visita;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface VisitaMapper {
    @Mappings({
            @Mapping(source = "fechaProgramada", target = "fecha"),
            @Mapping(source = "vendedor", target = "nombreVendedor"),
            @Mapping(source = "direccion", target = "lugar")
    })
    VisitaDto visitaToVisitaDto(Visita visita);

    @Mappings({
            @Mapping(source = "fecha", target = "fechaProgramada"),
            @Mapping(source = "nombreVendedor", target = "vendedor"),
            @Mapping(source = "lugar", target = "direccion")
    })
    Visita visitaDtoToVisita(VisitaDto visitaDto);
}
