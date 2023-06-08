package org.bedu.jse.sesion3.Ejemplo3.model;

import org.bedu.jse.sesion3.Ejemplo3.model.builders.RespuestaErrorBuilder;

import java.time.LocalDateTime;
import java.util.Map;

public class RespuestaError {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private int estatus;
    private Map<String, String> errores;
    private String ruta;

    public static RespuestaErrorBuilder builder() {
        return new RespuestaErrorBuilder();
    }
}
