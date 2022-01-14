package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: spring5webapp
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 13/01/2022
 * Hora: 23:35
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
