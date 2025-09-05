package pe.edu.upc.wattzybackend.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Distrito;
import pe.edu.upc.wattzybackend.repositories.IDistritoRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IDistritoService;
import java.util.List;

@Service
public class DistritoImplement implements IDistritoService {
    @Autowired
    private IDistritoRepository dR;

    @Override
    public void insert(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public List<Distrito> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }

    @Override
    public Distrito listID(int id) {
        return dR.findById(id).orElse(new Distrito());
    }
}
