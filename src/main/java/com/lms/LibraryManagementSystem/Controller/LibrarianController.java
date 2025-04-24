package com.lms.LibraryManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.LibraryManagementSystem.Entity.Librarian;
import com.lms.LibraryManagementSystem.Service.LibrarianService;

@RestController
@RequestMapping("api/v1")
public class LibrarianController {

  @Autowired
  private LibrarianService librarianService;

  @GetMapping("allLirarian")
  public List<Librarian> getAllLibrarian(){
    return librarianService.getallLibrarian();
  }
}
