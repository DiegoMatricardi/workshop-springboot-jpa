package com.projWeb.course.Services;

import com.projWeb.course.Entities.Order;
import com.projWeb.course.Entities.User;
import com.projWeb.course.Repository.OrderRepository;
import com.projWeb.course.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
       Optional <Order> obj = orderRepository.findById(id);
       return obj.get();
    }


}
