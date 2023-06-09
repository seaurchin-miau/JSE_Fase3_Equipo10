package org.bedu.jse.sesion6.Reto1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Table (name = "PRODUCTOS")
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String categoria;
    private float precio;
    @Column(name = "numero_registro", length = 20)
    private String numeroRegistro;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
}
