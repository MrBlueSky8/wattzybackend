package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public void insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(int id);
    public Categoria listID(int id);
}
