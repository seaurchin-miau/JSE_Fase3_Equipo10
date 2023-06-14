package Postwork.FinalProject.model;

import Postwork.FinalProject.validation.Name;
import jakarta.validation.constraints.*;

@Data
@Builder
@RequiredArgsConstructor
public class Cliente {

    @PositiveOrZero(message = "El identificador no puede ser un número negativo")
    private long id;

    @NotEmpty(message = "El nombre del cliente no puede estar vacío")
    @Size(min = 5, max = 30, message = "El nombre del cliente debe tener al menos 5 letras y ser menor a 30")
    private String name;

    @Email
    private String email;

    @Min(value = 10, message = "Los clientes con menos de 10 empleados no son válidos")
    @Max(value = 10000, message = "Los clientes con más de 10000 empleados no son válidos")
    private int numeroEmpleados;

    @NotBlank(message = "Se debe proporcionar una dirección")
    private String address;

}
