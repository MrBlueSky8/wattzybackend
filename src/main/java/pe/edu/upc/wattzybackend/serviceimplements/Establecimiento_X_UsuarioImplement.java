package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Establecimiento_X_Usuario;
import pe.edu.upc.wattzybackend.repositories.IEstablecimiento_X_UsuarioRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IEstablecimiento_X_UsuarioService;

import java.util.List;

@Service
public class Establecimiento_X_UsuarioImplement implements IEstablecimiento_X_UsuarioService {
    @Autowired
    private IEstablecimiento_X_UsuarioRepository euR;

    @Override
    public void insert(Establecimiento_X_Usuario establecimiento_x_usuario) {
        euR.save(establecimiento_x_usuario);
    }

    @Override
    public List<Establecimiento_X_Usuario> list() {
        return euR.findAll();
    }

    @Override
    public void delete(int id) {
        euR.deleteById(id);
    }

    @Override
    public Establecimiento_X_Usuario listId(int id) {
        return euR.findById(id).orElse(new Establecimiento_X_Usuario());
    }
}
