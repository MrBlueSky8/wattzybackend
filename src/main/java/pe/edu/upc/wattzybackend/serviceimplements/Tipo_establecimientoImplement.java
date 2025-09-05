package pe.edu.upc.wattzybackend.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Tipo_establecimiento;
import pe.edu.upc.wattzybackend.repositories.ITipo_establecimientoRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.ITipo_establecimientoService;
import java.util.List;

@Service
public class Tipo_establecimientoImplement implements ITipo_establecimientoService {
    @Autowired
    private ITipo_establecimientoRepository teR;

    @Override
    public void insert(Tipo_establecimiento tipo_establecimiento) {
        teR.save(tipo_establecimiento);
    }

    @Override
    public List<Tipo_establecimiento> list() {
        return teR.findAll();
    }

    @Override
    public void delete(int id) {
        teR.deleteById(id);
    }

    @Override
    public Tipo_establecimiento listID(int id) {
        return teR.findById(id).orElse(new Tipo_establecimiento());
    }
}
