package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.EstablecimientoDTO;
import pe.edu.upc.wattzybackend.entities.Establecimiento;
import pe.edu.upc.wattzybackend.serviceinterfaces.IEstablecimientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/establecimiento")
public class EstablecimientoController {
    @Autowired
    private IEstablecimientoService eS;
    @PostMapping
    public void registrar(@RequestBody EstablecimientoDTO e){
        ModelMapper m=new ModelMapper();
        Establecimiento es = m.map(e, Establecimiento.class);
        eS.insert(es);
    }
    @GetMapping
    public List<EstablecimientoDTO> list(){
        return eS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,EstablecimientoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody EstablecimientoDTO e){
        ModelMapper m=new ModelMapper();
        Establecimiento es = m.map(e,Establecimiento.class);
        eS.insert(es);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EstablecimientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        EstablecimientoDTO dto=m.map(eS.listId(id),EstablecimientoDTO.class);
        return dto;
    }
}
