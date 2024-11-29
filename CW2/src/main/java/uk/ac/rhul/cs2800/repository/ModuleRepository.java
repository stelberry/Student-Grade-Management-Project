package uk.ac.rhul.cs2800.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.rhul.cs2800.model.Module;

/**
 * A repository manages module repository.
 */
public interface ModuleRepository extends CrudRepository<Module, String> {

}
