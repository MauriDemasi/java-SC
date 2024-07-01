package com.apirest.mauridev.apirest.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apirest.mauridev.apirest.Entities.Product;


public interface ProductRepository extends JpaRepository <Product, Long> {


}
