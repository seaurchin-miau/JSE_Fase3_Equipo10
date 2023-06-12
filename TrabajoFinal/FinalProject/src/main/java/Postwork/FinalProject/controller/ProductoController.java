package Postwork.FinalProject.controller;

import Postwork.FinalProject.model.Cliente;
import Postwork.FinalProject.model.Etapa;
import Postwork.FinalProject.model.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos(){
        return ResponseEntity.ok(new LinkedList<>());
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long productoId){
        return ResponseEntity.ok(new Producto());
    }

    @PostMapping
    public ResponseEntity<Void> creaProducto(@RequestBody Producto producto){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{productoId}")
    public ResponseEntity<Void> actualizaProducto(@PathVariable Long productoId, @RequestBody Producto producto){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{productoId]")
    public ResponseEntity<Void> eliminaProducto(@PathVariable Long productoId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
