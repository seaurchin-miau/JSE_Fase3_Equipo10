package org.bedu.jse.sesion6.Ejemplo1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "correo_contacto", length = 30)
    private String correoContacto;
    @Column(name = "numero_empleados")
    private int numeroEmpleados;
    private String direccion;
}
