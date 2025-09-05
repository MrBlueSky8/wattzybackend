package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Establecimiento;
import pe.edu.upc.wattzybackend.repositories.IEstablecimientoRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IEstablecimientoService;

import java.util.List;

@Service
public class EstablecimientoImplement implements IEstablecimientoService {
    @Autowired
    private IEstablecimientoRepository eR;

    @Override
    public void insert(Establecimiento establecimiento) {
         eR.save(establecimiento);
    }

    @Override
    public List<Establecimiento> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Establecimiento listId(int id) {
        return eR.findById(id).orElse(new Establecimiento());
    }
}
