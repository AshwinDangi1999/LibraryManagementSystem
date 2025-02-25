package com.lms.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lms.LibraryManagementSystem.Entity.User;
import com.lms.LibraryManagementSystem.Repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User addUser(User user) {
    return userRepository.save(user);
  }

  public void deleteUser(String userid) {
    userRepository.deleteById(Long.valueOf(userid));
  }
  
}
