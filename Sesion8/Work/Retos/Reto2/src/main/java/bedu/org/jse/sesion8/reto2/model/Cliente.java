package bedu.org.jse.sesion8.reto2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private Long id;
    private String nombre;
    private String correoContacto;
    private int numeroEmpleados;
    private String direccion;
}
