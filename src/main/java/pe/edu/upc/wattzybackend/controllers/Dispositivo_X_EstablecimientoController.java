package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.Dispositivo_X_EstablecimientoDTO;
import pe.edu.upc.wattzybackend.entities.Dispositivo_X_Establecimiento;
import pe.edu.upc.wattzybackend.serviceinterfaces.IDispositivo_X_EstablecimientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivo_x_establecimiento")
public class Dispositivo_X_EstablecimientoController {
    @Autowired
    private IDispositivo_X_EstablecimientoService deS;
    @PostMapping
    public void registrar(@RequestBody Dispositivo_X_EstablecimientoDTO d){
        ModelMapper m=new ModelMapper();
        Dispositivo_X_Establecimiento de = m.map(d, Dispositivo_X_Establecimiento.class);
        deS.insert(de);
    }
    @GetMapping
    public List<Dispositivo_X_EstablecimientoDTO> list(){
        return deS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Dispositivo_X_EstablecimientoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody Dispositivo_X_EstablecimientoDTO d){
        ModelMapper m=new ModelMapper();
        Dispositivo_X_Establecimiento al = m.map(d,Dispositivo_X_Establecimiento.class);
        deS.insert(al);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        deS.delete(id);
    }

    @GetMapping("/{id}")
    public Dispositivo_X_EstablecimientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Dispositivo_X_EstablecimientoDTO dto=m.map(deS.listId(id),Dispositivo_X_EstablecimientoDTO.class);
        return dto;
    }
}
