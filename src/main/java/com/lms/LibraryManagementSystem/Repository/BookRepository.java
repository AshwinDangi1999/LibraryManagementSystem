package com.lms.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.LibraryManagementSystem.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
  
}
