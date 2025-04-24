package com.lms.LibraryManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.LibraryManagementSystem.Entity.User;
import com.lms.LibraryManagementSystem.Service.UserService;

import scala.collection.mutable.ListMap;

@RestController
@RequestMapping("api/v1")
public class UserController {
  
  @Autowired
  private UserService userService;

  @GetMapping("allUsers")
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @PostMapping("adduser")
  public void addUser(@RequestBody User user){
    userService.addUser(user);
  }
}
