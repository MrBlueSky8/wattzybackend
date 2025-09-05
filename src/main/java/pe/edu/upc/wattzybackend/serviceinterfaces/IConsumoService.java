package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Consumo;

import java.util.List;

public interface IConsumoService {
    public void insert(Consumo consumo);
    public List<Consumo> list();
    public void delete(int id);
    public Consumo listId(int id);
}
