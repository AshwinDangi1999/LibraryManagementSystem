package com.lms.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.LibraryManagementSystem.Entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
  
}
