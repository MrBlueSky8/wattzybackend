package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Plan_Accion;
import pe.edu.upc.wattzybackend.repositories.IPlan_AccionRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IPlan_AccionService;

import java.util.List;

@Service
public class Plan_AccionImplement implements IPlan_AccionService {
    @Autowired
    private IPlan_AccionRepository pR;

    @Override
    public void insert(Plan_Accion plan_accion) {
        pR.save(plan_accion);
    }

    @Override
    public List<Plan_Accion> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Plan_Accion listID(int id) {
        return pR.findById(id).orElse(new Plan_Accion());
    }
}
