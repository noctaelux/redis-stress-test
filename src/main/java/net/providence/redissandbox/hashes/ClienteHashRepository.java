package net.providence.redissandbox.hashes;

import net.providence.redissandbox.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteHashRepository extends CrudRepository<Cliente,String> {
}
