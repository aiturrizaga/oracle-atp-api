package pe.edu.vallegrande.oracle.service;

import pe.edu.vallegrande.oracle.model.Person;

import java.util.List;

public interface PersonService {
    Person save(Person person);
    Person update(String id, Person person);
    List<Person> findAll();
    void delete(String id);
}
