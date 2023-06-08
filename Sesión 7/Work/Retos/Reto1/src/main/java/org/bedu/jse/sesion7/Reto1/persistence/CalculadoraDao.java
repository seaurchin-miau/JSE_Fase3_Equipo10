package org.bedu.jse.sesion7.Reto1.persistence;

import org.springframework.stereotype.Component;

@Component
public interface CalculadoraDao {
    int findValorConstante(int valorInicial);
}
