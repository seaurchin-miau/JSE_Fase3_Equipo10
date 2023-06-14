package Postwork.FinalProject.model.updateClasses;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdatedProducto {

    @NotBlank
    private String categoria;

    @NotNull
    @DecimalMin(value = "1.00", inclusive = true)
    private float precio;


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
