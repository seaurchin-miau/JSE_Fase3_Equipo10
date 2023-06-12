package Postwork.FinalProject.controller;

import Postwork.FinalProject.model.Cliente;
import Postwork.FinalProject.model.Etapa;
import Postwork.FinalProject.model.Visita;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/visita")
public class VisitaController {

    @GetMapping
    public ResponseEntity<List<Visita>> getVisitas(@RequestParam Long clienteId){
        return ResponseEntity.ok(new LinkedList<>());
    }

    @GetMapping("/{visitaId}")
    public ResponseEntity<Visita> getVisita(@PathVariable Long visitaId){
        return ResponseEntity.ok(new Visita());
    }

    @PostMapping
    public ResponseEntity<Void> creaVisita(@RequestBody Visita visita, @RequestParam Long clienteId){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{visitaId}")
    public ResponseEntity<Void> actualizaVisita(@PathVariable Long visitaId, @RequestBody Visita visita){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{visitaId]")
    public ResponseEntity<Void> eliminaVisita(@PathVariable Long visitaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
