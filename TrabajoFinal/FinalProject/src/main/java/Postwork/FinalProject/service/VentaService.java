package Postwork.FinalProject.service;

import Postwork.FinalProject.model.Cliente;
import Postwork.FinalProject.model.Producto;
import Postwork.FinalProject.model.Venta;
import Postwork.FinalProject.model.updateClasses.UpdatedVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class VentaService {

    private ClienteService agenda;
    private ProductoService inventario;

    @Autowired
    public VentaService(ClienteService agenda, ProductoService inventario){
        this.agenda = agenda;
        this.inventario = inventario;
    }


    private List<Producto> compra1 = new ArrayList<>();
    private List<Producto> compra2 = new ArrayList<>();
    private Map<Long, Venta> listaVentas = new HashMap<>();
    public VentaService() {

        compra1.add(inventario.getOne((long)1111));
        compra1.add(inventario.getOne((long)1111));

        compra2.add(inventario.getOne((long)1111));
        compra2.add(inventario.getOne((long)1111));

        listaVentas.put((long)000001, new Venta(0001, 1555.0f, compra1, agenda.getOne((long)1111)));
        listaVentas.put( (long)000002, new Venta(0002, 1655.0f, compra2, agenda.getOne((long)1111)));

    }


    /*public List<Venta> getAll(Long Id) {
        List<Venta> ventas = new LinkedList<>();

        for (Venta venta : listaVentas) {
            if (venta.getCliente().getId() == Id) {
                ventas.add(venta);
            }
            return ventas;
        }

        return null;
    }*/

    public Venta getOne(Long ventaId){
        return listaVentas.get(ventaId);
    }

    /*public Venta add(){

    }*/

    public void update(Long ventaId, UpdatedVenta venta){
        Venta current = listaVentas.get(ventaId);
        current.setMonto(venta.getMonto());
        current.setProductos(venta.getProductos());
    }

    public void remove(Long ventaId){
        listaVentas.remove(ventaId);
    }

}
