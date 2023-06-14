package Postwork.FinalProject.persistence.entities;

import Postwork.FinalProject.validation.Name;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENTES")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(name = "correo_contacto", nullable = false)
    private String email;

    @Column(name = "numero_empleados")
    private int numeroEmpleados;

    private String address;

}
