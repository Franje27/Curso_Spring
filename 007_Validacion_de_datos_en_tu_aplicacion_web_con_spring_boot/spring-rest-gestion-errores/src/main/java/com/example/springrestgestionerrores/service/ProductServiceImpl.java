package com.example.springrestgestionerrores.service;

import com.example.springrestgestionerrores.error.ProductTitleException;
import com.example.springrestgestionerrores.model.Product;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product findById(Long id) {
        throw new NoSuchElementException("Product not found");
    }

    @Override
    public Product save(Product product) {
        throw new ProductTitleException(product) ;
    }

    @Override
    public Product deleteById(Long id) {
        throw new NullPointerException("Error al intentar eliminar el producto");
    }
}
