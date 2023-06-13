package Postwork.FinalProject.model;

import Postwork.FinalProject.validation.OtherNames;
import jakarta.validation.constraints.*;

@Data
@Builder
@RequiredArgsConstructor
public class Etapa {

    @PositiveOrZero(message = "El identificador de la etapa no puede ser un número negativo")
    private long etapaId;

    @NotEmpty(message = "El nombre de la etapa no puede estar en blanco.")
    @Size(min = 4, max = 30, message = "El nombre de la etapa debe tener entre 4 y 30 letras.")
    private String name;

    @Positive(message = "La etapa debe tener un orden positivo mayor a cero")
    private int orden;

}
