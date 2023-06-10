package org.bedu.jse.sesion6.Ejemplo2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ETAPAS")
public class Etapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etapaId;

    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false, unique = true)
    private Integer orden;
}
