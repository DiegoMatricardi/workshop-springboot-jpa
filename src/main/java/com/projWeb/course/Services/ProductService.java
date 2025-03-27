package com.projWeb.course.Services;

import com.projWeb.course.Entities.Category;
import com.projWeb.course.Entities.Product;
import com.projWeb.course.Repository.CategoryRepository;
import com.projWeb.course.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
       Optional <Product> obj = productRepository.findById(id);
       return obj.get();
    }


}
