package com.project.api.config;

import com.project.api.entities.User;
import com.project.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;


  @Override
  public void run(String... args) throws Exception {

    User u1 = new User(1L, "Maria Brown", "maria@email.com", "85986198071", "passwordteste");
    User u2 = new User(2L, "Alex Green", "alex@email.com", "85987208182", "passwordteste");

    userRepository.saveAll(Arrays.asList(u1, u2));
  }
}
