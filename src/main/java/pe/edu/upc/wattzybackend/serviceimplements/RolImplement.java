package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Rol;
import pe.edu.upc.wattzybackend.repositories.IRolRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IRolService;

import java.util.List;
@Service
public class RolImplement implements IRolService {
    @Autowired
    private IRolRepository eR;

    @Override
    public void insert(Rol roles) {
        eR.save(roles);
    }

    @Override
    public List<Rol> list() {
        return eR.findAll();
    }

    @Override
    public Rol listId(int id) {
        return eR.findById(id).orElse(new Rol());
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }
}
