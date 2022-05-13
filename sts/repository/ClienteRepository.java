package home.nathyelson.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.nathyelson.sts.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> { 

	
}
