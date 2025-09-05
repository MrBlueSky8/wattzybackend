package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Dispositivo;
import pe.edu.upc.wattzybackend.repositories.IDispositivoRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IDispositivoService;

import java.util.List;

@Service
public class DispositivoImplement implements IDispositivoService {
    @Autowired
    private IDispositivoRepository dR;

    @Override
    public void insert(Dispositivo dispositivo) {
        dR.save(dispositivo);
    }

    @Override
    public List<Dispositivo> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }

    @Override
    public Dispositivo listId(int id) {
        return dR.findById(id).orElse(new Dispositivo());
    }
}
