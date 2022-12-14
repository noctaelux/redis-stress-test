package net.providence.redissandbox.hashes;

import net.providence.redissandbox.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteHashRepository extends CrudRepository<Cliente,String> {

    Optional<Cliente> findFirstByNombre(String nombre);

}
