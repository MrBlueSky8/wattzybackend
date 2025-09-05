package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.CategoriaDTO;
import pe.edu.upc.wattzybackend.entities.Categoria;
import pe.edu.upc.wattzybackend.serviceinterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService caS;
    @PostMapping
    public void registrar(@RequestBody CategoriaDTO c){
        ModelMapper m=new ModelMapper();
        Categoria ca=m.map(c, Categoria.class);
        caS.insert(ca);
    }
    @GetMapping
    public List<CategoriaDTO> list(){

        return caS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CategoriaDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void Editar(@RequestBody CategoriaDTO c){
        ModelMapper m=new ModelMapper();
        Categoria ca = m.map(c,Categoria.class);
        caS.insert(ca);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        caS.delete(id);
    }

    @GetMapping("/{id}")
    public CategoriaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CategoriaDTO dto=m.map(caS.listID(id),CategoriaDTO.class);
        return dto;
    }
}
