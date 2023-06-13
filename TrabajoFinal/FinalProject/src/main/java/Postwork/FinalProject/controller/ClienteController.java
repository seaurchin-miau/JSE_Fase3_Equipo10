package Postwork.FinalProject.controller;

import Postwork.FinalProject.model.Cliente;
import Postwork.FinalProject.model.updateClasses.UpdatedCliente;
import Postwork.FinalProject.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@Validated
public class ClienteController {

    private ClienteService agenda;

    @Autowired
    public ClienteController(ClienteService agenda) {
        this.agenda = agenda;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getClientes(){
        return agenda.getAll();
    }

    @GetMapping("/{clienteId}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente getCliente(@PathVariable Long clienteId){
        return agenda.getOne(clienteId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente creaCliente(@Valid @RequestBody Cliente cliente){
        return agenda.add(cliente);
    }

    @PutMapping("/{clienteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void actualizaCliente(@PathVariable Long clienteId, @Valid @RequestBody UpdatedCliente cliente){
        agenda.update(clienteId, cliente);
    }

    @DeleteMapping("/{clienteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminaCliente(@PathVariable Long cienteId){
        agenda.remove(cienteId);
    }

}
