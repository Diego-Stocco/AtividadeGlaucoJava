package com.fatec.itu.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.itu.demo.entites.Product;

public interface Repository extends JpaRepository<Product, Long>{
    
}
