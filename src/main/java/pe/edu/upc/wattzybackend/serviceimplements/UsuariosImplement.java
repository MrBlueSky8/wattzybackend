package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Usuarios;
import pe.edu.upc.wattzybackend.repositories.IUsuarioRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IUsuariosService;

import java.util.List;

@Service
public class UsuariosImplement implements IUsuariosService {
    @Autowired
    private IUsuarioRepository eR;

    @Override
    public void insert(Usuarios eventos) {
        eR.save(eventos);
    }

    @Override
    public List<Usuarios> list() {
        return eR.findAll();
    }

    @Override
    public Usuarios listId(int id) {
        return eR.findById(id).orElse(new Usuarios());
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }
}
