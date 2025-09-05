package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Alerta;

import java.util.List;

public interface IAlertaService {
    public void insert(Alerta alerta);
    public List<Alerta> list();
    public void delete(int id);
    public Alerta listId(int id);
}
