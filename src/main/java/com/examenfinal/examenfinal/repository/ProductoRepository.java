package com.examenfinal.examenfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.examenfinal.examenfinal.model.Producto;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
  
}
