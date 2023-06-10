package org.bedu.jse.sesion7.Ejemplo1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculadoraService {
    public int suma(int a, int b) {
        return a + b + calculadoraDao.findValorConstante();
    }
    public int resta(int a, int b) {
        return a - b + calculadoraDao.findValorConstante();
    }
    public int multiplica(int a, int b) {
        return a * b + calculadoraDao.findValorConstante();
    }
}
