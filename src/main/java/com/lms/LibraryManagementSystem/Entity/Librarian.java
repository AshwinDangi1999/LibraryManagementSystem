package com.lms.LibraryManagementSystem.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Librarian {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long librarianId;
  private String name;
  private long employeeId;
  private String email;
  private String role;
  private String contact;
  
  public Librarian() {
  }

  public Librarian(long librarianId, String name, long employeeId, String email, String role, String contact) {
    this.librarianId = librarianId;
    this.name = name;
    this.employeeId = employeeId;
    this.email = email;
    this.role = role;
    this.contact = contact;
  }

  public long getLibrarianId() {
    return librarianId;
  }

  public void setLibrarianId(long librarianId) {
    this.librarianId = librarianId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  @Override
  public String toString() {
    return "Librarian [librarianId=" + librarianId + ", name=" + name + ", employeeId=" + employeeId + ", email="
        + email + ", role=" + role + ", contact=" + contact + "]";
  }

  
}
