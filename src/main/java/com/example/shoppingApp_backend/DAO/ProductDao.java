package com.example.shoppingApp_backend.DAO;


import com.example.shoppingApp_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
