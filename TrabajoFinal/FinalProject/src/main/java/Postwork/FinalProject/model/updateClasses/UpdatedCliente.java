package Postwork.FinalProject.model.updateClasses;

import jakarta.validation.constraints.*;

public class UpdatedCliente {

    @Email
    @NotEmpty
    private String email;

    @PositiveOrZero
    @Max(value = 10000)
    private int numeroEmpleados;

    @NotBlank
    private String address;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
