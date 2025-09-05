package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Dispositivo_X_Establecimiento;

import java.util.List;

public interface IDispositivo_X_EstablecimientoService {
    public void insert(Dispositivo_X_Establecimiento dispositivo_X_Establecimiento);
    public List<Dispositivo_X_Establecimiento> list();
    public void delete(int id);
    public Dispositivo_X_Establecimiento listId(int id);
}
