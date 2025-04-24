package com.lms.LibraryManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.LibraryManagementSystem.Entity.Book;
import com.lms.LibraryManagementSystem.Entity.Transaction;
import com.lms.LibraryManagementSystem.Service.BookService;
import com.lms.LibraryManagementSystem.Service.TransactionService;

@RestController
@RequestMapping("api/v1")
public class BookController {

  @Autowired
  private BookService bookService;

  @Autowired
  private TransactionService transactionService;
  
  @GetMapping("allbooks")
  public List<Book> getAllBooks(){
    return bookService.getAllBooks();
  }

  @PostMapping("addbook")
  public void addBook(@RequestBody Book book){
    bookService.addBook(book);
  }

  @PostMapping("borrow")
  public Transaction borrowBook(@RequestParam(name = "userid") Long userId, 
  @RequestParam(name = "bookid") Long bookId)
  {
    System.out.println(userId);
    return transactionService.borrowBook(userId, bookId);
  }

  @PostMapping("returnbook/{transactionId}")
  public Transaction returnBook(@PathVariable Long transactionId){
    return transactionService.returnBook(transactionId);
  }
}
