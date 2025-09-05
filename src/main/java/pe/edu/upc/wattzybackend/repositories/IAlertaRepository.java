package pe.edu.upc.wattzybackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.wattzybackend.entities.Alerta;

@Repository
public interface IAlertaRepository extends JpaRepository<Alerta, Integer> {
}
