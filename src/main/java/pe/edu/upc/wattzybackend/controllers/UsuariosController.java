package pe.edu.upc.wattzybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.wattzybackend.dtos.UsuarioDTO;
import pe.edu.upc.wattzybackend.entities.Usuarios;
import pe.edu.upc.wattzybackend.serviceinterfaces.IUsuariosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private IUsuariosService eS;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuariosDTO) {
        ModelMapper d=new ModelMapper();

        String passwordEncriptado = passwordEncoder.encode(usuariosDTO.getPassword());
        usuariosDTO.setPassword(passwordEncriptado);

        Usuarios usuarios = d.map(usuariosDTO,Usuarios.class);
        eS.insert(usuarios);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO usuariosDTO) {
        ModelMapper d=new ModelMapper();


        if(usuariosDTO.getPassword() != null && !usuariosDTO.getPassword().trim().isEmpty()){
            // Obtener usuario actual de BD
            Usuarios usuarioExistente = eS.listId(usuariosDTO.getId_usuario());

            String nuevoPassword = usuariosDTO.getPassword();
            String passwordActualEnBD = usuarioExistente.getPassword();

            // Solo encriptar si el password fue cambiado
            if (!passwordEncoder.matches(nuevoPassword, passwordActualEnBD)) {
                usuariosDTO.setPassword(passwordEncoder.encode(nuevoPassword));
            } else {
                usuariosDTO.setPassword(passwordActualEnBD); // para mantener el mismo
            }
        } else {
            // Si no se envió password, mantener el actual
            String passwordActualEnBD = eS.listId(usuariosDTO.getId_usuario()).getPassword();
            usuariosDTO.setPassword(passwordActualEnBD);
        }


        Usuarios usuarios = d.map(usuariosDTO,Usuarios.class);
        eS.insert(usuarios);
    }

    @GetMapping
    public List<UsuarioDTO> listar(){
        return eS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UsuarioDTO dto=m.map(eS.listId(id),UsuarioDTO.class);
        return dto;
    }
}
