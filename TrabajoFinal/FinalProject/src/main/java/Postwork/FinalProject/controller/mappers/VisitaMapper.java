package Postwork.FinalProject.controller.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitaMapper {
    Visita visitaModelToVisitaEntity(Postwork.FinalProject.model.Visita visitaModel);

    Postwork.FinalProject.model.Visita visitaEntityToVisitaModel(Visita visita);
}
