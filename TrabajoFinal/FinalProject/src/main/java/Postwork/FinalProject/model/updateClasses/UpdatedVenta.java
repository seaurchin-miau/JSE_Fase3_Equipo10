package Postwork.FinalProject.model.updateClasses;

import Postwork.FinalProject.model.Producto;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public class UpdatedVenta {

    @NotNull
    @DecimalMin(value = "1.00", inclusive = true)
    private float monto;

    @NotNull
    private List<Producto> productos;


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


}
