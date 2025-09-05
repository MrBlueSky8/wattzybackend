package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Categoria;
import pe.edu.upc.wattzybackend.repositories.ICategoriaRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaImplement implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;

    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Categoria listID(int id) {
        return cR.findById(id).orElse(new Categoria());
    }
}
