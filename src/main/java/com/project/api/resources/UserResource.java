package com.project.api.resources;

import com.project.api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
  @GetMapping
  public ResponseEntity<User> findAll() {
      User u = new User(1L, "teste", "teste@email.com", "973985137", "passwordteste");
      return ResponseEntity.ok(u);
  }
}
