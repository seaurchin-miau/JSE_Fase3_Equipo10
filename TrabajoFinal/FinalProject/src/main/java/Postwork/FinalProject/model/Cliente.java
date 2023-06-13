package Postwork.FinalProject.model;

import Postwork.FinalProject.validation.Name;
import jakarta.validation.constraints.*;

public class Cliente {

    @NotNull
    @PositiveOrZero
    private long id;

    @Name
    private String name;

    @Email
    @NotEmpty
    private String email;

    @PositiveOrZero
    @Max(value = 10000)
    private int numeroEmpleados;

    @NotBlank
    private String address;


    public Cliente(long id, String name, String email, int numeroEmpleados, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.numeroEmpleados = numeroEmpleados;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
