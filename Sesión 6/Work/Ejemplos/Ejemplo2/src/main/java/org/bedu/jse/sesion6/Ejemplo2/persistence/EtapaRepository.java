package org.bedu.jse.sesion6.Ejemplo2.persistence;

import org.bedu.jse.sesion6.Ejemplo2.model.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtapaRepository extends JpaRepository<Etapa, Long> {
}
