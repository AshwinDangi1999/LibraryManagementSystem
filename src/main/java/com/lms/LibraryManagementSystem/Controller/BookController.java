package com.lms.LibraryManagementSystem.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.LibraryManagementSystem.Entity.Book;
import com.lms.LibraryManagementSystem.Service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api/v1/")
public class BookController {
  
  @Autowired
  private BookService bookService;

  @GetMapping("/allbooks")
  public List<Book> getAllBooks() {
      return bookService.getAllBooks();
  }
  
  @PostMapping("/addbook")
  public Book addBook(@RequestBody Book book) {
      
      return bookService.addBook(book);
  }

  // @PutMapping("updatebook/{id}")
  // public String updateBook(@PathVariable String id, @RequestBody String entity) {
  //     //TODO: process PUT request
      
  //     return entity;
  // }

  @DeleteMapping("deletebook/{bookid}")
  public void deleteBook(@PathVariable String bookid){
    bookService.deleteBook(bookid);
  }
  
  
}
