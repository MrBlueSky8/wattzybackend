package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Dispositivo;

import java.util.List;

public interface IDispositivoService {
    public void insert(Dispositivo dispositivo);
    public List<Dispositivo> list();
    public void delete(int id);
    public Dispositivo listId(int id);
}
