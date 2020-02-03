package co.com.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.models.entities.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long>{

	List<Movimiento> findByCuentaOrderByFechaDesc(Long cuenta);

}
