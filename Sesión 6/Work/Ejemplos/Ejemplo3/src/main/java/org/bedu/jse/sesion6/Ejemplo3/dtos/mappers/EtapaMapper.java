package org.bedu.jse.sesion6.Ejemplo3.dtos.mappers;

import org.bedu.jse.sesion6.Ejemplo3.dtos.EtapaDto;
import org.bedu.jse.sesion6.Ejemplo3.model.Etapa;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaDtoToEtapa(EtapaDto etapaDto);

    EtapaDto etapatoEtapaDto(Etapa etapa);
}
