package org.bedu.jse.sesion6.Reto2.dtos.mappers;

import org.bedu.jse.sesion6.Reto2.dtos.EtapaDto;
import org.bedu.jse.sesion6.Reto2.model.Etapa;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaDtoToEtapa(EtapaDto etapaDto);

    EtapaDto etapatoEtapaDto(Etapa etapa);
}
