package org.bedu.jse.sesion6.Reto1.controllers;

import lombok.RequiredArgsConstructor;
import org.bedu.jse.sesion6.Reto1.model.Producto;
import org.bedu.jse.sesion6.Reto1.persistence.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    @PostMapping
    public ResponseEntity<Void> creaProducto(@RequestBody Producto producto){
        Producto productoDB = productoRepository.save(producto);

        return ResponseEntity.created(URI.create(String.valueOf(producto.getId()))).build();
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long productoId){

        Optional<Producto> productoDB = productoRepository.findById(productoId);

        if(!productoDB.isPresent())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto especificado no existe.");

        return ResponseEntity.ok(productoDB.get());
    }
    private final ProductoRepository productoRepository;
    }

