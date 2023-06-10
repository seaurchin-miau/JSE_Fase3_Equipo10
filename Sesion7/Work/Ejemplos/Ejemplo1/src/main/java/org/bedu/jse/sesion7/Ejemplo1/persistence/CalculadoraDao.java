package org.bedu.jse.sesion7.Ejemplo1.persistence;

import org.springframework.stereotype.Component;

@Component
public interface CalculadoraDao {
    int findValorConstante();
}
