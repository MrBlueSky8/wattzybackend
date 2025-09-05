package pe.edu.upc.wattzybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Dispositivo;

@Repository
public interface IDispositivoRepository extends JpaRepository<Dispositivo, Integer> {
}
