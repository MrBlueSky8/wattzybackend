package pe.edu.upc.wattzybackend.serviceinterfaces;
import pe.edu.upc.wattzybackend.entities.Plan_Accion;

import java.util.List;

public interface IPlan_AccionService {
    public void insert(Plan_Accion plan_accion);
    public List<Plan_Accion> list();
    public void delete(int id);
    public Plan_Accion listID(int id);
}
