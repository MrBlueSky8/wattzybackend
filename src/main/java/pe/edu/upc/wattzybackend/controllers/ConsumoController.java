package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.ConsumoDTO;
import pe.edu.upc.wattzybackend.entities.Consumo;
import pe.edu.upc.wattzybackend.serviceinterfaces.IConsumoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/consumo")
public class ConsumoController {
    @Autowired
    private IConsumoService cS;
    @PostMapping
    public void registrar(@RequestBody ConsumoDTO c){
        ModelMapper m=new ModelMapper();
        Consumo co = m.map(c, Consumo.class);
        cS.insert(co);
    }
    @GetMapping
    public List<ConsumoDTO> list(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ConsumoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody ConsumoDTO c){
        ModelMapper m=new ModelMapper();
        Consumo co = m.map(c,Consumo.class);
        cS.insert(co);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ConsumoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ConsumoDTO dto=m.map(cS.listId(id),ConsumoDTO.class);
        return dto;
    }
}
