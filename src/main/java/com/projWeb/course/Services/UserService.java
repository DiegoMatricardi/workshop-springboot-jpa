package com.projWeb.course.Services;

import com.projWeb.course.Entities.User;
import com.projWeb.course.Repository.UserRepository;
import com.projWeb.course.Services.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
       Optional <User> obj = userRepository.findById(id);
       return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id, User obj){
        User user = userRepository.getReferenceById(id);
        updateData(user,obj);
        return userRepository.save(user);
    }

    private void updateData(User user, User obj) {
        user.setName(obj.getName());
        user.setEmail(obj.getEmail());
        user.setPassword(obj.getPassword());
    }

}
