package Postwork.FinalProject.service;

import Postwork.FinalProject.model.Producto;
import Postwork.FinalProject.model.updateClasses.UpdatedProducto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@Service
public class ProductoService {

    private Map<Long, Producto> inventario;

    public ProductoService() {
        inventario = new HashMap<Long, Producto>();

        inventario.put((long)1111, new Producto(1111, "llantas", "servicios", 1200.0f, "222XX5", LocalDate.of(2020, 5, 8)));
        inventario.put((long)2222, new Producto(2222, "cristales", "piezas", 500.0f, "54$$3", LocalDate.of(2019,4,12 )));
    }


    public boolean exists(Long productoId) {
        return inventario.containsKey(productoId);
    }

    public List<Producto> getAll() {
        return new LinkedList<>(inventario.values());
    }

    public Producto getOne(Long productoId) {
        return inventario.get(productoId);
    }

    public Producto add(Producto producto) {
        inventario.put(producto.getProductoId(), producto);
        return producto;
    }

    public void update(Long productoId, UpdatedProducto producto) {
        Producto current = inventario.get(productoId);
        current.setCategoria(producto.getCategoria());
        current.setPrecio(producto.getPrecio());
    }

    public void remove(Long productoId) {
        inventario.remove(productoId);
    }

}
