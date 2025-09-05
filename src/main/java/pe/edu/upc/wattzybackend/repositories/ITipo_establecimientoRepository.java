package pe.edu.upc.wattzybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Tipo_establecimiento;

@Repository
public interface ITipo_establecimientoRepository extends JpaRepository<Tipo_establecimiento, Integer> {
}
