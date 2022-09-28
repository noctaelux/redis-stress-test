package net.providence.redissandbox.repository;

import net.providence.redissandbox.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends CrudRepository<Cliente, String> {
}
