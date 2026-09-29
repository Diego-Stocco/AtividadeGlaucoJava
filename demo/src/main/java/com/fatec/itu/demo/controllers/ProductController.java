package com.fatec.itu.demo.controllers;

import com.fatec.itu.demo.repositories.Repository;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.itu.demo.entites.Product;
import com.fatec.itu.demo.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    
private final Repository repository;
private final ProductService service;

    ProductController(ProductService service, Repository repository) {
        this.service = service;
        this.repository = repository;
    }

@GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Product> getById(@PathVariable long id){
        return ResponseEntity.ok(service.findById(id));
    }

    public list<Product> findALL(){
        return repository.findAll();
    }
}
