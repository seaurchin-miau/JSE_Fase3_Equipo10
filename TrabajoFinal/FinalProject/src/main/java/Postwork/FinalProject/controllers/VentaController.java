package Postwork.FinalProject.controller;

import Postwork.FinalProject.model.Venta;
import Postwork.FinalProject.service.VentaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    private VentaService ventas;
    @Autowired
    public VentaController(VentaService ventas){
        this.ventas = ventas;
    }

    /*@GetMapping
    public List<Venta> getAll(@RequestParam Long Id){
        return ventas.getAll(Id);
    }*/

    @GetMapping("/{ventaId}")
    public Venta getVenta(@PathVariable Long ventaId){
       return ventas.getOne(ventaId);
    }

    /*@PostMapping
    public ResponseEntity<Void> creaVenta(@RequestBody @Valid Venta venta, @RequestParam Long clienteId){
        return ResponseEntity.created(URI.create("")).build();
    }*/

    @PutMapping("/{ventaId}")
    public ResponseEntity<Void> actualizaVenta(@PathVariable Long ventaId, @RequestBody @Valid Venta venta){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{ventaId}")
    public ResponseEntity<Void> eliminaVenta(@PathVariable Long ventaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
