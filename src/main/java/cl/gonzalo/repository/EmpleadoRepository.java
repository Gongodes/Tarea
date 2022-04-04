package cl.gonzalo.repository;

import org.springframework.data.repository.CrudRepository;
import  cl.gonzalo.model.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
}
