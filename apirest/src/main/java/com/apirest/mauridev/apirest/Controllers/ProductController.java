package com.apirest.mauridev.apirest.Controllers;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.mauridev.apirest.Repositories.ProductRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.apirest.mauridev.apirest.Entities.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List <Product> getAllProducts(){

        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {

        return productRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Product not found")
        );
    }
    
    @PostMapping
    public Product createProduct (@RequestBody Product producto) {
        
        return productRepository.save(producto);
    }
    
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Product detailsProduct) {    
        
        Product updatedProduct = productRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Product not found")
        );

        updatedProduct.setNombre(detailsProduct.getNombre());
        updatedProduct.setPrecio(detailsProduct.getPrecio());
        productRepository.save(updatedProduct);
        return "Product updated: "+ updatedProduct;

    }

    @DeleteMapping ("/{id}")
    public String deleteProduct(@PathVariable Long id) {

        Product deletedProduct = productRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Product not found")
        );

        productRepository.delete(deletedProduct);
        return "Product deleted: "+ deletedProduct;
    }

}
