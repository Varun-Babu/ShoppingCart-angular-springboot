package com.example.shoppingApp_backend.DAO;

import com.example.shoppingApp_backend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
