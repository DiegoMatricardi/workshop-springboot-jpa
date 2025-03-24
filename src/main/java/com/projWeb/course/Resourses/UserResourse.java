package com.projWeb.course.Resourses;

import com.projWeb.course.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Diego", "diego@hotmail.com", "12345678", "12345");
        return ResponseEntity.ok().body(u);
    }
}
