package com.project.api.services;

import com.project.api.entities.User;
import com.project.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  @Autowired
  private UserRepository respository;

  public List<User> findAll(){
      return respository.findAll();
  }

  public User findById(Long id){
    Optional<User> obj = respository.findById(id);
    return obj.get();
  }
}
