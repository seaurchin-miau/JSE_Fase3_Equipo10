package org.bedu.jse.sesion6.Ejemplo1.persistence;

import org.bedu.jse.sesion6.Ejemplo1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
