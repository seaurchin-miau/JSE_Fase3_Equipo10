package org.bedu.jse.sesion5.Ejemplo3.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private long id;
    private String nombre;
    private String correoContacto;
    private int numeroEmpleados;
    private String direccion;
}
