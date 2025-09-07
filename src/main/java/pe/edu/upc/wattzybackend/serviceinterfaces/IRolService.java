package pe.edu.upc.wattzybackend.serviceinterfaces;

import pe.edu.upc.wattzybackend.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol roles);
    public List<Rol> list();
    public Rol listId(int id);
    public void delete(int id);
}
