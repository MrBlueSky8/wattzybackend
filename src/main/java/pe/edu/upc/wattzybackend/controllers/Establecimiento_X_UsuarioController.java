package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.Establecimiento_X_UsuarioDTO;
import pe.edu.upc.wattzybackend.entities.Establecimiento_X_Usuario;
import pe.edu.upc.wattzybackend.serviceinterfaces.IEstablecimiento_X_UsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/establecimiento_x_usuario")
public class Establecimiento_X_UsuarioController {
    @Autowired
    private IEstablecimiento_X_UsuarioService euS;
    @PostMapping
    public void registrar(@RequestBody Establecimiento_X_UsuarioDTO e){
        ModelMapper m=new ModelMapper();
        Establecimiento_X_Usuario eu = m.map(e, Establecimiento_X_Usuario.class);
        euS.insert(eu);
    }
    @GetMapping
    public List<Establecimiento_X_UsuarioDTO> list(){
        return euS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Establecimiento_X_UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody Establecimiento_X_UsuarioDTO e){
        ModelMapper m=new ModelMapper();
        Establecimiento_X_Usuario eu = m.map(e,Establecimiento_X_Usuario.class);
        euS.insert(eu);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        euS.delete(id);
    }

    @GetMapping("/{id}")
    public Establecimiento_X_UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Establecimiento_X_UsuarioDTO dto=m.map(euS.listId(id),Establecimiento_X_UsuarioDTO.class);
        return dto;
    }
}
