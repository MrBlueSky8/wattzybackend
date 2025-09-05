package pe.edu.upc.wattzybackend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.wattzybackend.entities.Consumo;
import pe.edu.upc.wattzybackend.repositories.IConsumoRepository;
import pe.edu.upc.wattzybackend.serviceinterfaces.IConsumoService;

import java.util.List;

@Service
public class ConsumoImplement implements IConsumoService {
    @Autowired
    private IConsumoRepository cR;

    @Override
    public void insert(Consumo consumo) {
        cR.save(consumo);
    }

    @Override
    public List<Consumo> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Consumo listId(int id) {
        return cR.findById(id).orElse(new Consumo());
    }
}
