package com.lms.LibraryManagementSystem.Entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class Transaction {

  @Id
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
  private long transID;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;
  private Date borrowedDate;
  private Date dueDate;
  private Date returnDate;
  private double fine;
  
  public Transaction() {
  }

  public Transaction(long transID, User user, Book book, Date borrowedDate, Date dueDate, Date returnDate, double fine) {
    this.transID = transID;
    this.user = user;
    this.book = book;
    this.borrowedDate = borrowedDate;
    this.dueDate = dueDate;
    this.returnDate = returnDate;
    this.fine = fine;
  }

  public long getTransID() {
    return transID;
  }

  public void setTransID(long transID) {
    this.transID = transID;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Date getBorrowedDate() {
    return borrowedDate;
  }

  public void setBorrowedDate(Date borrowedDate) {
    this.borrowedDate = borrowedDate;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public double getFine() {
    return fine;
  }

  public void setFine(double fine) {
    this.fine = fine;
  }

  @Override
  public String toString() {
    return "Transaction [transID=" + transID + ", user=" + user + ", book=" + book + ", borrowedDate=" + borrowedDate
        + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine + "]";
  }
  

}
