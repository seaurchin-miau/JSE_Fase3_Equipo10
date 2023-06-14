package Postwork.FinalProject.model;

import Postwork.FinalProject.validation.Id;
import Postwork.FinalProject.validation.Name;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@RequiredArgsConstructor
public class Visita {

    @PositiveOrZero(message = "El identificador de la visita no puede ser un número negativo.")
    private long id;

    @PositiveOrZero(message = "El identificador del cliente no puede ser un número negativo.")
    private long clienteId;

    @Future(message = "La fecha de la cita no puede ser en una fecha en el pasado.")
    private LocalDateTime fechaProgramada;

    @NotEmpty(message = "La dirección no puede estar en blanco.")
    @Size(min = 10, message = "La dirección debe tener al menos 10 letras.")
    private String direccion;

    @NotEmpty(message = "El propósito de la visita no puede estar en blanco.")
    @Size(min = 15, message = "El propósito de la visita debe tener al menos 15 letras.")
    private String proposito;

    @NotEmpty(message = "El nombre del vendedor no puede estar en blanco.")
    @Size(min = 4, max = 30, message = "El nombre del vendedor debe tener entre 4 y 30 letras.")
    private String vendedor;

}
