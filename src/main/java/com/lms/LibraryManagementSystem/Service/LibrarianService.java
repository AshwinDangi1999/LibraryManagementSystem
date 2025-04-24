package com.lms.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.LibraryManagementSystem.Entity.Librarian;
import com.lms.LibraryManagementSystem.Repository.LibrarianRepository;

@Service
public class LibrarianService {

  @Autowired
  private LibrarianRepository librarianRepository;

  public List<Librarian> getallLibrarian(){
    return librarianRepository.findAll();
  }
  
}
