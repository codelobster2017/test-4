import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookTest {

    @Test
    void findBookByIdTest(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book book1 = mock(Book.class);
        when(bookService.findBookById("0")).thenReturn(book1);

        Book bookResult = bookService.findBookById("0");

        assertEquals(book1, bookResult);
    }

    @Test
    void findAllBookTest(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        List<Book> mockBook = mock(List.class);
        mockBook.add(mock(Book.class));
        when(bookService.findAllBooks()).thenReturn(mockBook);

        List<Book> booksResult = bookService.findAllBooks();

        assertEquals(mockBook, booksResult);
    }
}
