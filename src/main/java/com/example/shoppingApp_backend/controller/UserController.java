package com.example.shoppingApp_backend.controller;

import com.example.shoppingApp_backend.DAO.ProductDao;
import com.example.shoppingApp_backend.DAO.UserDao;
import com.example.shoppingApp_backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

@RestController
public class UserController {


    @Autowired
    private UserDao dao;

    @PostMapping(path="/adduser", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> AddUser(@RequestBody User u){
        dao.save(u);
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }


}
