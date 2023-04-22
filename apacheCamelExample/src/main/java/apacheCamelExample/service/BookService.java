package apacheCamelExample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import apacheCamelExample.entity.Book;
import apacheCamelExample.repository.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookByName(String name) {
        return bookRepository.findBookByName(name);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void removeBook(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
