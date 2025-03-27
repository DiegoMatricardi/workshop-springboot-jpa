package com.projWeb.course.Repository;

import com.projWeb.course.Entities.Order;
import com.projWeb.course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
