package pe.edu.upc.wattzybackend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Plan_Accion;

@Repository
public interface IPlan_AccionRepository extends JpaRepository<Plan_Accion, Integer> {
}
