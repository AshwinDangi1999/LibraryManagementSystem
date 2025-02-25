package com.lms.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lms.LibraryManagementSystem.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  
}
