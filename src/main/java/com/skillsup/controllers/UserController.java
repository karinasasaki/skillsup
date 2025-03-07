package com.skillsup.controllers;

import com.skillsup.models.User;
import com.skillsup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository usuarioRepository;

  @GetMapping
  public List<User> getAllUsers() {
    return usuarioRepository.findAll();
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    return usuarioRepository.save(user);
  }
}
