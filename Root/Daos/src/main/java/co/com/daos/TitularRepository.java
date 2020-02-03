package co.com.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.models.entities.Titular;

public interface TitularRepository extends JpaRepository<Titular, Long>{	
	
	Titular findByCuit(Long cuit);
	
}
