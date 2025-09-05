package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.DistritoDTO;
import pe.edu.upc.wattzybackend.entities.Distrito;
import pe.edu.upc.wattzybackend.serviceinterfaces.IDistritoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private IDistritoService dS;
    @PostMapping
    public void registrar(@RequestBody DistritoDTO d){
        ModelMapper m=new ModelMapper();
        Distrito di=m.map(d,Distrito.class);
        dS.insert(di);
    }
    @GetMapping
    public List<DistritoDTO> list(){

        return dS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,DistritoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody DistritoDTO d){
        ModelMapper m=new ModelMapper();
        Distrito di = m.map(d,Distrito.class);
        dS.insert(di);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public DistritoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DistritoDTO dto=m.map(dS.listID(id),DistritoDTO.class);
        return dto;
    }
}
