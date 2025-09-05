package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Establecimiento;

import java.util.List;

public interface IEstablecimientoService {
    public void insert(Establecimiento establecimiento);
    public List<Establecimiento> list();
    public void delete(int id);
    public Establecimiento listId(int id);
}
