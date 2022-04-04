package cl.gonzalo.repository;

import cl.gonzalo.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository <Cliente, Long> {


}
