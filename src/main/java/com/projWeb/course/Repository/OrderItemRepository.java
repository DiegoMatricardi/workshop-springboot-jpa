package com.projWeb.course.Repository;

import com.projWeb.course.Entities.Order;
import com.projWeb.course.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
