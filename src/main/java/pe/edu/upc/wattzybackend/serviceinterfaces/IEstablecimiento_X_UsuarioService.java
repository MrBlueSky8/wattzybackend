package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Establecimiento_X_Usuario;

import java.util.List;

public interface IEstablecimiento_X_UsuarioService {
    public void insert(Establecimiento_X_Usuario establecimiento_x_usuario);
    public List<Establecimiento_X_Usuario> list();
    public void delete(int id);
    public Establecimiento_X_Usuario listId(int id);
}
