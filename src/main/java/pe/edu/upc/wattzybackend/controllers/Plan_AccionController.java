package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.Plan_AccionDTO;
import pe.edu.upc.wattzybackend.entities.Plan_Accion;
import pe.edu.upc.wattzybackend.serviceinterfaces.IPlan_AccionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/plan_accion")
public class Plan_AccionController {
    @Autowired
    private IPlan_AccionService pS;
    @PostMapping
    public void registrar(@RequestBody Plan_AccionDTO p){
        ModelMapper m=new ModelMapper();
        Plan_Accion pl=m.map(p, Plan_Accion.class);
        pS.insert(pl);
    }
    @GetMapping
    public List<Plan_AccionDTO> list(){

        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Plan_AccionDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody Plan_AccionDTO p){
        ModelMapper m=new ModelMapper();
        Plan_Accion pl = m.map(p,Plan_Accion.class);
        pS.insert(pl);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public Plan_AccionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Plan_AccionDTO dto=m.map(pS.listID(id),Plan_AccionDTO.class);
        return dto;
    }
}
