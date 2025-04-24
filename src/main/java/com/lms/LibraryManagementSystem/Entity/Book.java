package com.lms.LibraryManagementSystem.Entity;

import java.sql.Date;

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
  private String title;
  private String author;
  private String isbn;
  private String publisher;
  private Date publicationDate;
  private String genre;
  private int numberOfCopies;
  private int availableCopies;
  private String librarySection;
  @ManyToOne
  private User user;
  
  public Book() {
  }

  public Book(long bookid, String title, String author, String isbn, String publisher, Date publicationDate,
      String genre, int numberOfCopies, int availableCopies, String librarySection, User user) {
    this.bookid = bookid;
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.publisher = publisher;
    this.publicationDate = publicationDate;
    this.genre = genre;
    this.numberOfCopies = numberOfCopies;
    this.availableCopies = availableCopies;
    this.librarySection = librarySection;
    this.user = user;
  }

  public long getBookid() {
    return bookid;
  }

  public void setBookid(long bookid) {
    this.bookid = bookid;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getNumberOfCopies() {
    return numberOfCopies;
  }

  public void setNumberOfCopies(int numberOfCopies) {
    this.numberOfCopies = numberOfCopies;
  }

  public int getAvailableCopies() {
    return availableCopies;
  }

  public void setAvailableCopies(int availableCopies) {
    this.availableCopies = availableCopies;
  }

  public String getLibrarySection() {
    return librarySection;
  }

  public void setLibrarySection(String librarySection) {
    this.librarySection = librarySection;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", publisher="
        + publisher + ", publicationDate=" + publicationDate + ", genre=" + genre + ", numberOfCopies=" + numberOfCopies
        + ", availableCopies=" + availableCopies + ", librarySection=" + librarySection + ", user=" + user + "]";
  }
  
  
}
