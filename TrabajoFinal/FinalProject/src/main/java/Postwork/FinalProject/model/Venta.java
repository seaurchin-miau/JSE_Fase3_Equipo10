package Postwork.FinalProject.model;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.List;

public class Venta {

    @NotNull
    @PositiveOrZero
    private long ventaId;

    @NotNull
    @DecimalMin(value = "1.00", inclusive = true)
    private float monto;

    @NotNull
    private List<Producto> productos;

    @NotNull
    private Cliente cliente;


    public Venta(long ventaId, float monto, List<Producto> productos, Cliente cliente) {
        this.ventaId = ventaId;
        this.monto = monto;
        this.productos = productos;
        this.cliente = cliente;
    }

    public long getVentaId() {
        return ventaId;
    }

    public void setVentaId(long ventaId) {
        this.ventaId = ventaId;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
