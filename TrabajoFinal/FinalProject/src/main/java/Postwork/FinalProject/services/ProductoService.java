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
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    public Producto guardaProducto(Producto producto) {
        return mapper.productoEntityToProductoModel(
                repository.save(mapper.productoModelToProductoEntity(producto))
        );
    }

    public List<Producto> obtenProductos(){
        return repository.findAll().stream().map(Producto -> mapper.productoEntityToProductoModel(Producto)).collect(Collectors.toList());
    }

    public Optional<Producto> obtenProducto(long idProducto) {
        return repository.findById(idProducto)
                .map(producto -> Optional.of(mapper.productoEntityToProductoModel(producto)))
                .orElse(Optional.empty());
    }

    public void eliminaProducto(long idProducto){
        repository.deleteById(idProducto);
    }

    public Producto actualizaProducto(Producto producto){
        return mapper.productoEntityToProductoModel(
                repository.save(mapper.productoModelToProductoEntity(producto))
        );
    }

    public long cuenteProductos(){
        return repository.count();
    }
}
