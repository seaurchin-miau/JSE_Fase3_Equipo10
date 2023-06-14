package Postwork.FinalProject.controller.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaModelToEtapaEntity(Postwork.FinalProject.model.Etapa etapaModel);

    Postwork.FinalProject.model.Etapa etapaEntityToEtapaModel(Etapa etapa);
}
