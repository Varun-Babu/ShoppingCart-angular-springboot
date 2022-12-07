package com.example.shoppingApp_backend.controller;

import com.example.shoppingApp_backend.DAO.ProductDao;
import com.example.shoppingApp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> AddProduct(@RequestBody Product p){
        dao.save(p);
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Product> ViewProduct(){
        return (List<Product>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List SearchProduct(@RequestBody Product p){
        String name = String.valueOf(p.getName());
        System.out.println(name);
        return (List<Product>)dao.SearchProduct(p.getName());
    }

}
