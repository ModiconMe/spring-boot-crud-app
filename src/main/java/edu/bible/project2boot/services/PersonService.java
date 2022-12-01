package edu.bible.project2boot.services;

import edu.bible.project2boot.models.Book;
import edu.bible.project2boot.models.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();

    Optional<Person> findById(int id);

    void save(Person person);

    void update(int id, Person updatedPerson);

    void deleteById(int id);

    List<Book> findBooks(int id);
}
