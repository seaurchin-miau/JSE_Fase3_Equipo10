package org.bedu.jse.sesion5.Ejemplo3.dtos;

import lombok.Builder;
import lombok.Data;

public class ClienteDto {
    @Data
    @Builder
    public class ClienteDto {
        private String nombre;
        private String numeroEmpleados;
        private String direccion;
    }
}
