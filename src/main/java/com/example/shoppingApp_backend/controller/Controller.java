package com.example.shoppingApp_backend.controller;

import com.example.shoppingApp_backend.DAO.ProductDao;
import com.example.shoppingApp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> addProduct(@RequestBody Product p){
        dao.save(p);
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

}
