package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Tipo_establecimiento;
import java.util.List;

public interface ITipo_establecimientoService {
    public void insert(Tipo_establecimiento tipo_establecimiento);
    public List<Tipo_establecimiento> list();
    public void delete(int id);
    public Tipo_establecimiento listID(int id);
}
