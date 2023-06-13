package Postwork.FinalProject.controller;

import Postwork.FinalProject.model.Producto;
import Postwork.FinalProject.model.updateClasses.UpdatedProducto;
import Postwork.FinalProject.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {


    private ProductoService inventario;
    @Autowired
    public ProductoController(ProductoService inventario){
        this.inventario = inventario;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> getProductos(){
        return inventario.getAll();
    }

    @GetMapping("/{productoId}")
    @ResponseStatus(HttpStatus.OK)
    public Producto getProducto(@PathVariable Long productoId){
        return inventario.getOne(productoId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producto creaProducto(@RequestBody @Valid Producto producto){
        return inventario.add(producto);
    }

    @PutMapping("/{productoId}")
    public void actualizaProducto(@PathVariable Long productoId, @RequestBody @Valid UpdatedProducto producto){
        inventario.update(productoId, producto);
    }

    @DeleteMapping("/{productoId}")
    public void eliminaProducto(@PathVariable Long productoId){
        inventario.remove(productoId);
    }

}
