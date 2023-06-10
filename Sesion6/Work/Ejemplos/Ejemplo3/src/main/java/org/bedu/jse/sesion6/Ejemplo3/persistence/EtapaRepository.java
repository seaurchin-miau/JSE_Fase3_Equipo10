package org.bedu.jse.sesion6.Ejemplo3.persistence;

import org.bedu.jse.sesion6.Ejemplo3.model.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtapaRepository extends JpaRepository<Etapa, Long> {
}
