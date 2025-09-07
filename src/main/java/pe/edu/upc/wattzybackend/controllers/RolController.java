package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.RolDTO;
import pe.edu.upc.wattzybackend.entities.Rol;
import pe.edu.upc.wattzybackend.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService eS;

    @PostMapping
    public void insertar(@RequestBody RolDTO rolesDTO) {
        ModelMapper d=new ModelMapper();
        Rol roles = d.map(rolesDTO,Rol.class);
        eS.insert(roles);
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO eventosDTO) {
        ModelMapper d=new ModelMapper();
        Rol roles = d.map(eventosDTO,Rol.class);
        eS.insert(roles);
    }

    @GetMapping
    public List<RolDTO> listar(){
        return eS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RolDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }
    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RolDTO dto=m.map(eS.listId(id),RolDTO.class);
        return dto;
    }
}
