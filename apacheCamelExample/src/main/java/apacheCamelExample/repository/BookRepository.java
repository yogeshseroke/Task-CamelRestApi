package apacheCamelExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apacheCamelExample.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book findBookByName(String name);

}
