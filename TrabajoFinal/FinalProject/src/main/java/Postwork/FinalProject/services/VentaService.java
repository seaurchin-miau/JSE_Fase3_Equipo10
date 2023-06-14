package Postwork.FinalProject.service;

import Postwork.FinalProject.exception.NotFoundException;
import Postwork.FinalProject.model.Cliente;
import Postwork.FinalProject.model.Producto;
import Postwork.FinalProject.model.Venta;
import Postwork.FinalProject.model.updateClasses.UpdatedVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
@RequiredArgsConstructor
public class VentaService {
    private final VentaRepository repository;
    private final VentaMapper mapper;

    public Venta guardaVenta(Venta Venta) {
        return mapper.ventaEntityToVentaModel(
                repository.save(mapper.ventaModelToVentaEntity(Venta))
        );
    }

    public List<Venta> obtenVentas(){
        return repository.findAll().stream().map(venta -> mapper.ventaEntityToVentaModel(venta)).collect(Collectors.toList());
    }

    public Optional<Venta> obtenVenta(long idVenta) {
        return repository.findById(idVenta)
                .map(venta -> Optional.of(mapper.ventaEntityToVentaModel(venta)))
                .orElse(Optional.empty());
    }

    public void eliminaVenta(long idVenta){
        repository.deleteById(idVenta);
    }

    public Venta actualizaVenta(Venta venta){
        return mapper.ventaEntityToVentaModel(
                repository.save(mapper.ventaModelToVentaEntity(venta))
        );
    }

    public long cuenteVentas(){
        return repository.count();
    }
}
