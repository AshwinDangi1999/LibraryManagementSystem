package com.lms.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.LibraryManagementSystem.Entity.Book;
import com.lms.LibraryManagementSystem.Repository.BookRepository;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  public Book addBook(Book book) {
    return bookRepository.save(book);
  }

  public void deleteBook(String bookid) {
     bookRepository.deleteById(Long.valueOf(bookid));  
  }
  
}
