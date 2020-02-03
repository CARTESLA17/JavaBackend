package co.com.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.models.entities.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

}
