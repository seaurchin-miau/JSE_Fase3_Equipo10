package Postwork.FinalProject.model;

import Postwork.FinalProject.validation.OtherNames;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class Producto {


    @NotNull
    @PositiveOrZero
    private long productoId;

    @OtherNames
    private String name;

    @NotBlank
    private String categoria;

    @NotNull
    @DecimalMin(value = "1.00", inclusive = true)
    private float precio;


    private String numeroRegistro;

    @PastOrPresent
    private LocalDate creacion;


    public Producto(long productoId, String name, String categoria, float precio, String numeroRegistro, LocalDate creacion) {
        this.productoId = productoId;
        this.name = name;
        this.categoria = categoria;
        this.precio = precio;
        this.numeroRegistro = numeroRegistro;
        this.creacion = creacion;
    }

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }
}
