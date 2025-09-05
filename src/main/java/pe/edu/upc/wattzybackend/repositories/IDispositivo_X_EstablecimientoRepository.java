package pe.edu.upc.wattzybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Dispositivo_X_Establecimiento;

@Repository
public interface IDispositivo_X_EstablecimientoRepository extends JpaRepository<Dispositivo_X_Establecimiento, Integer> {
}
