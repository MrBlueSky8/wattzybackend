package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.AlertaDTO;
import pe.edu.upc.wattzybackend.entities.Alerta;
import pe.edu.upc.wattzybackend.serviceinterfaces.IAlertaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alerta")
public class AlertaController {
    @Autowired
    private IAlertaService aS;
    @PostMapping
    public void registrar(@RequestBody AlertaDTO a){
        ModelMapper m=new ModelMapper();
        Alerta al = m.map(a, Alerta.class);
        aS.insert(al);
    }
    @GetMapping
    public List<AlertaDTO> list(){
        return aS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,AlertaDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody AlertaDTO a){
        ModelMapper m=new ModelMapper();
        Alerta al = m.map(a,Alerta.class);
        aS.insert(al);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public AlertaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        AlertaDTO dto=m.map(aS.listId(id),AlertaDTO.class);
        return dto;
    }
}
