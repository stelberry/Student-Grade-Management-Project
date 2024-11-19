package uk.ac.rhul.cs2800.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.rhul.cs2800.model.Module;


public interface ModuleRepository extends CrudRepository<Module, Long> {

}
