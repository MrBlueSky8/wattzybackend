package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Dispositivo_X_Establecimiento;
import pe.edu.upc.wattzybackend.repositories.IDispositivo_X_EstablecimientoRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IDispositivo_X_EstablecimientoService;

import java.util.List;

@Service
public class Dispositivo_X_EstablecimientoImplement implements IDispositivo_X_EstablecimientoService {
    @Autowired
    private IDispositivo_X_EstablecimientoRepository deR;

    @Override
    public void insert(Dispositivo_X_Establecimiento dispositivo_X_Establecimiento) {
        deR.save(dispositivo_X_Establecimiento);
    }

    @Override
    public List<Dispositivo_X_Establecimiento> list() {
        return deR.findAll();
    }

    @Override
    public void delete(int id) {
        deR.deleteById(id);
    }

    @Override
    public Dispositivo_X_Establecimiento listId(int id) {
        return deR.findById(id).orElse(new Dispositivo_X_Establecimiento());
    }
}
