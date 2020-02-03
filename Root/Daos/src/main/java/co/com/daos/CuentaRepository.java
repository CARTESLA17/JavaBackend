package co.com.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.models.entities.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long>{

}
