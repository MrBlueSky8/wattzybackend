package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.Tipo_establecimientoDTO;
import pe.edu.upc.wattzybackend.entities.Tipo_establecimiento;
import pe.edu.upc.wattzybackend.serviceinterfaces.ITipo_establecimientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_establecimiento")
public class Tipo_establecimientoController {
    @Autowired
    private ITipo_establecimientoService teS;
    @PostMapping
    public void registrar(@RequestBody Tipo_establecimientoDTO t){
        ModelMapper m=new ModelMapper();
        Tipo_establecimiento te=m.map(t, Tipo_establecimiento.class);
        teS.insert(te);
    }
    @GetMapping
    public List<Tipo_establecimientoDTO> list(){

        return teS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Tipo_establecimientoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody Tipo_establecimientoDTO t){
        ModelMapper m=new ModelMapper();
        Tipo_establecimiento te = m.map(t,Tipo_establecimiento.class);
        teS.insert(te);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        teS.delete(id);
    }

    @GetMapping("/{id}")
    public Tipo_establecimientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Tipo_establecimientoDTO dto=m.map(teS.listID(id),Tipo_establecimientoDTO.class);
        return dto;
    }
}
