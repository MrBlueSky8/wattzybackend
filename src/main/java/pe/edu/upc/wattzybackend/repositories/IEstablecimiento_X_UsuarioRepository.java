package pe.edu.upc.wattzybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Establecimiento_X_Usuario;

@Repository
public interface IEstablecimiento_X_UsuarioRepository extends JpaRepository<Establecimiento_X_Usuario, Integer> {
}
