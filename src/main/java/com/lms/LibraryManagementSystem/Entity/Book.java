package com.lms.LibraryManagementSystem.Entity;

import org.hibernate.annotations.UuidGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class Book {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long bookid;
  private String isbn;
  private String bookname;
  private String genre;
  private String author;
  private int quantity;
  @ManyToOne
  private User user;
  
  public Book() {
  }

  public Book(String isbn, String bookname, String genre, String author, int quantity) {
    this.isbn = isbn;
    this.bookname = bookname;
    this.genre = genre;
    this.author = author;
    this.quantity = quantity;
  }

  public long getBookid() {
    return bookid;
  }

  public void setBookid(long bookid) {
    this.bookid = bookid;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "Book [bookid=" + bookid + ", isbn=" + isbn + ", bookname=" + bookname + ", genre=" + genre + ", author="
        + author + ", quantity=" + quantity + "]";
  }

  
}
