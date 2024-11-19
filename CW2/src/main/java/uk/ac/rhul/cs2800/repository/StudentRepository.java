package uk.ac.rhul.cs2800.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.rhul.cs2800.model.Student;

/*
 * A repository manages student intances.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

}
