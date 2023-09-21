package com.project.api.config;

import com.project.api.entities.Order;
import com.project.api.entities.User;
import com.project.api.repositories.OrderRepository;
import com.project.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;


  @Override
  public void run(String... args) throws Exception {

    User u1 = new User(null, "Maria Brown", "maria@email.com", "85986198071", "passwordteste");
    User u2 = new User(null, "Alex Green", "alex@email.com", "85987208182", "passwordteste");

    Order o1 = new Order(null, Instant.parse("2023-09-21T19:53:07Z"), u1);
    Order o2 = new Order(null, Instant.parse("2023-09-21T20:00:10Z"), u1);
    Order o3 = new Order(null, Instant.parse("2019-09-21T19:53:22Z"), u2);

    userRepository.saveAll(Arrays.asList(u1, u2));
    orderRepository.saveAll(Arrays.asList(o1, o2, o3));
  }
}
