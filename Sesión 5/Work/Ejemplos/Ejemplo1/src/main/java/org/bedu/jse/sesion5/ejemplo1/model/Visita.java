package org.bedu.jse.sesion5.ejemplo1.model;

import lombok.Data;
import lombok.experimental.Builder;

import java.time.LocalDateTime;
@lombok.Builder
@Data
public class Visita {
    private long id;
    private final LocalDateTime fechaProgramada;
    private String direccion;
    private String proposito;
    private final String vendedor;
}
