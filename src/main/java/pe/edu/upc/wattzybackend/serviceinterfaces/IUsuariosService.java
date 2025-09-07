package pe.edu.upc.wattzybackend.serviceinterfaces;

import pe.edu.upc.wattzybackend.entities.Usuarios;

import java.util.List;

public interface IUsuariosService {
    public void insert(Usuarios eventos);
    public List<Usuarios> list();
    public Usuarios listId(int id);
    public void delete(int id);
}
