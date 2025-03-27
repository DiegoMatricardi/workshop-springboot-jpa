package com.projWeb.course.Repository;

import com.projWeb.course.Entities.Category;
import com.projWeb.course.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
