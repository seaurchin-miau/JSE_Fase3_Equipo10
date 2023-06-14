package Postwork.FinalProject.persistence.entities;

import Postwork.FinalProject.validation.OtherNames;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor@Table(name = "ETAPAS")
@Entity
public class Etapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long etapaId;

    private String name;

    @Column(unique = true, nullable = false)
    private int orden;

}
