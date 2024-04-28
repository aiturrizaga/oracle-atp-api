package pe.edu.vallegrande.oracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.oracle.model.Person;

public interface PersonRepository extends JpaRepository<Person, String> {
}
