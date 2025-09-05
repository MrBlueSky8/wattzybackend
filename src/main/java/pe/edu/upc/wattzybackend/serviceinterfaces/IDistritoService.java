package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Distrito;
import  java.util.List;

public interface IDistritoService {
    public void insert(Distrito distrito);
    public List<Distrito> list();
    public void delete(int id);
    public Distrito listID(int id);
}
