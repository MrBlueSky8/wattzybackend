package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Alerta;
import pe.edu.upc.wattzybackend.entities.Establecimiento_X_Usuario;
import pe.edu.upc.wattzybackend.repositories.IAlertaRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IAlertaService;

import java.util.List;

@Service
public class AlertaImplement implements IAlertaService {
    @Autowired
    private IAlertaRepository aR;

    @Override
    public void insert(Alerta alerta) {
        aR.save(alerta);
    }

    @Override
    public List<Alerta> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }

    @Override
    public Alerta listId(int id) {
        return aR.findById(id).orElse(new Alerta());
    }
}
