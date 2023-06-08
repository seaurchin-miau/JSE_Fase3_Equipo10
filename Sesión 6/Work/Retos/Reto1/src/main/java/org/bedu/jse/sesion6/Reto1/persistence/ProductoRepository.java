package org.bedu.jse.sesion6.Reto1.persistence;

import org.bedu.jse.sesion6.Reto1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
