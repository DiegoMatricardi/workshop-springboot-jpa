package com.projWeb.course.Services;

import com.projWeb.course.Entities.Category;
import com.projWeb.course.Entities.Order;
import com.projWeb.course.Repository.CategoryRepository;
import com.projWeb.course.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
       Optional <Category> obj = categoryRepository.findById(id);
       return obj.get();
    }


}
