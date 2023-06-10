package org.bedu.jse.sesion7.Reto1.services;

import lombok.RequiredArgsConstructor;
import org.bedu.jse.sesion7.Reto1.persistence.CalculadoraDao;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculadoraService {

    public int suma(int a, int b, int c) {
        return a + b + calculadoraDao.findValorConstante(c);
    }

    public int resta(int a, int b, int c) {
        return a - b + calculadoraDao.findValorConstante(c);
    }

    public int multiplica(int a, int b, int c) {
        return a * b + calculadoraDao.findValorConstante(c);
    }

    private final CalculadoraDao calculadoraDao;
}
