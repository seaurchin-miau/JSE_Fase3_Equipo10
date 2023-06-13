package Postwork.FinalProject.service;

import Postwork.FinalProject.model.Cliente;
import Postwork.FinalProject.model.updateClasses.UpdatedCliente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@Service
public class ClienteService {

    private Map<Long, Cliente> agenda;

    public ClienteService() {
        agenda = new HashMap<Long, Cliente>();

        agenda.put((long)1111, new Cliente(1111, "Pedro", "pedro@gmail.com", 12, "calle B. Juarez #333"));
        agenda.put((long)2222, new Cliente(2222, "Juana", "juana@gmail.com", 142, "calle Palomares #123"));
    }

    public boolean exists(Long clienteId) {
        return agenda.containsKey(clienteId);
    }

    public List<Cliente> getAll() {
        return new LinkedList<>(agenda.values());
    }

    public Cliente getOne(Long clienteId) {
        return agenda.get(clienteId);
    }

    public Cliente add(Cliente cliente) {
        agenda.put(cliente.getId(), cliente);
        return cliente;
    }

    public void update(Long clienteId, UpdatedCliente cliente) {
        Cliente current = agenda.get(clienteId);
        current.setEmail(cliente.getEmail());
        current.setAddress(cliente.getAddress());
        current.setNumeroEmpleados(cliente.getNumeroEmpleados());
    }

    public void remove(Long clienteId) {
        agenda.remove(clienteId);
    }

}
