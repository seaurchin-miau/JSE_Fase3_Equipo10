package Postwork.FinalProject.controller;

import Postwork.FinalProject.model.Etapa;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/etapa")
public class EtapaController {

    @GetMapping
    public ResponseEntity<List<Etapa>> getEtapas(@RequestParam Long clienteId){
        return ResponseEntity.ok(new LinkedList<>());
    }

    @GetMapping("/{etapaId}")
    public ResponseEntity<Etapa> getEtapa(@PathVariable Long etapaId){
        return ResponseEntity.ok(new Etapa());
    }

    @PostMapping
    public ResponseEntity<Void> creaEtapa(@RequestBody @Valid Etapa etapa, @RequestParam Long clienteId){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{etapaId}")
    public ResponseEntity<Void> actualizaEtapa(@PathVariable Long etapaId, @RequestBody @Valid Etapa etapa){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{etapaId}")
    public ResponseEntity<Void> eliminaEtapa(@PathVariable Long etapaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
