package Postwork.FinalProject.service;

import Postwork.FinalProject.exception.AlreadyExistsException;
import Postwork.FinalProject.exception.NotFoundException;
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

        inventario.put((long)1001, new Producto(1001, "llantas", "servicios", 1200.0f, "222XX5", LocalDate.of(2020, 5, 8)));
        inventario.put((long)2001, new Producto(2001, "cristales", "piezas", 500.0f, "54$$3", LocalDate.of(2019,4,12 )));
    }


    public boolean exists(Long productoId) {
        return inventario.containsKey(productoId);
    }

    public List<Producto> getAll() {
        return new LinkedList<>(inventario.values());
    }

    public Producto getOne(Long productoId) {
        if (!exists(productoId)) {
            throw new NotFoundException("Product with Id: " + productoId.toString());
        }

        return inventario.get(productoId);
    }

    public Producto add(Producto producto) {
        if (exists(producto.getProductoId())) {
            throw new AlreadyExistsException();
        }

        inventario.put(producto.getProductoId(), producto);
        return producto;
    }

    public void update(Long productoId, UpdatedProducto producto) {
        if (!exists(productoId)) {
            throw new NotFoundException("Product with Id: " + productoId.toString());
        }

        Producto current = inventario.get(productoId);

            current.setCategoria(producto.getCategoria());
            current.setPrecio(producto.getPrecio());
    }

    public void remove(Long productoId) {
        if (!exists(productoId)) {
            throw new NotFoundException("Product with Id: " + productoId.toString());
        }

        inventario.remove(productoId);
    }

}
