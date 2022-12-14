package edu.bible.project2boot.repositories;

import edu.bible.project2boot.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByPersonId(int personId);
    List<Book> findByLabelStartingWithIgnoreCase(String start);
    List<Book> findByLabelLikeIgnoreCase(String like);
    // like = "%text%"
    //https://www.baeldung.com/spring-jpa-like-queries
}
