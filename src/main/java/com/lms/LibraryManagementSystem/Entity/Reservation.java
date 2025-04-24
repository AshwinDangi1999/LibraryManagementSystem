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
public class Reservation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long reservationId;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;
  private Date reservationDate;
  private String status;
  private Date availabiityDate;
 
  public Reservation() {
  }

  public Reservation(long reservationId, User user, Book book, Date reservationDate, String status,
      Date availabiityDate) {
    this.reservationId = reservationId;
    this.user = user;
    this.book = book;
    this.reservationDate = reservationDate;
    this.status = status;
    this.availabiityDate = availabiityDate;
  }

  public long getReservationId() {
    return reservationId;
  }

  public void setReservationId(long reservationId) {
    this.reservationId = reservationId;
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

  public Date getReservationDate() {
    return reservationDate;
  }

  public void setReservationDate(Date reservationDate) {
    this.reservationDate = reservationDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getAvailabiityDate() {
    return availabiityDate;
  }

  public void setAvailabiityDate(Date availabiityDate) {
    this.availabiityDate = availabiityDate;
  }

  @Override
  public String toString() {
    return "Reservation [reservationId=" + reservationId + ", user=" + user + ", book=" + book + ", reservationDate="
        + reservationDate + ", status=" + status + ", availabiityDate=" + availabiityDate + "]";
  }
  
  
  
}
