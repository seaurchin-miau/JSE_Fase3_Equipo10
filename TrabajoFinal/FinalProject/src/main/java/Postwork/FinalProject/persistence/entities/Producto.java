package Postwork.FinalProject.persistence.entities;

import Postwork.FinalProject.validation.OtherNames;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCTOS")
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productoId;

    private String name;

    private String categoria;

    private float precio;

    @Column(name = "numero_registro", length = 20)
    private String numeroRegistro;

    @Column(name = "fecha_creacion")
    private LocalDate creacion;

}
