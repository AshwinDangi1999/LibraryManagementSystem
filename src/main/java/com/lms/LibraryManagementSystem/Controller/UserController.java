package com.lms.LibraryManagementSystem.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.LibraryManagementSystem.Entity.User;
import com.lms.LibraryManagementSystem.Service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("api/v1/")
public class UserController {
  
  @Autowired
  private UserService userService;

  @GetMapping("/allusers")
  public List<User> getAllUsers() {
      return userService.getAllUsers();
  }

  @PostMapping("/adduser")
  public User addUser(@RequestBody User user) {
     return userService.addUser(user);
  }
  
  // @PutMapping("path/{id}")
  // public String putMethodName(@PathVariable String id, @RequestBody String entity) {
  //     //TODO: process PUT request
      
  //     return entity;
  // }
  
  @DeleteMapping("/deleteuser/{userid}")
  public void deleteUser(@PathVariable String userid){
      userService.deleteUser(userid);
  }
}
