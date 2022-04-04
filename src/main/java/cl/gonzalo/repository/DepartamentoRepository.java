package cl.gonzalo.repository;

import cl.gonzalo.model.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {
}
