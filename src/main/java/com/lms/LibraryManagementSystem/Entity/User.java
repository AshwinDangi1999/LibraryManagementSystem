package com.lms.LibraryManagementSystem.Entity;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long userid;
  private String name;
  private String email;
  private String contact;
  private String address;
  private String role;
  private Date   DOR;
  private String accountStatus;
  @OneToMany(mappedBy = "user")
  private List<Book> books; 

  
  @OneToMany(mappedBy = "user")
  private List<Transaction> transactions;

  @OneToMany(mappedBy = "user")
  private List<Reservation> reservation;

  
  public User() {
  }

  public User(long userid, String name, String email, String contact, String address, String role, Date dOR,
      String accountStatus) {
    this.userid = userid;
    this.name = name;
    this.email = email;
    this.contact = contact;
    this.address = address;
    this.role = role;
    DOR = dOR;
    this.accountStatus = accountStatus;

  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Date getDOR() {
    return DOR;
  }

  public void setDOR(Date dOR) {
    DOR = dOR;
  }

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }


}
