package pe.edu.upc.wattzybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Usuarios;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Integer> {
    public Usuarios findByCorreo(String correo);
    @Query(value = "SELECT r.tipo_rol\n" +
            "FROM usuarios u\n" +
            "JOIN rol r ON u.rol_id = r.id_rol\n" +
            "WHERE u.correo = :email", nativeQuery = true)
    String obtenerNombreRolPorEmail(@Param("email") String email);
}
