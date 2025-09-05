package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.DispositivoDTO;
import pe.edu.upc.wattzybackend.entities.Dispositivo;
import pe.edu.upc.wattzybackend.serviceinterfaces.IDispositivoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {
    @Autowired
    private IDispositivoService dS;
    @PostMapping
    public void registrar(@RequestBody DispositivoDTO d){
        ModelMapper m=new ModelMapper();
        Dispositivo di = m.map(d, Dispositivo.class);
        dS.insert(di);
    }
    @GetMapping
    public List<DispositivoDTO> list(){
        return dS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,DispositivoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody DispositivoDTO d){
        ModelMapper m=new ModelMapper();
        Dispositivo di = m.map(d,Dispositivo.class);
        dS.insert(di);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public DispositivoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        DispositivoDTO dto=m.map(dS.listId(id),DispositivoDTO.class);
        return dto;
    }
}
