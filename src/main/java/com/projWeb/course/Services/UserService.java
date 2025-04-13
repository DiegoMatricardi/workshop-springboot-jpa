package com.projWeb.course.Services;

import com.projWeb.course.Entities.User;
import com.projWeb.course.Repository.UserRepository;
import com.projWeb.course.Services.Exceptions.DatabaseException;
import com.projWeb.course.Services.Exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }

        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }


    public User update(Long id, User obj){

        try {
            User user = userRepository.getReferenceById(id);
            updateData(user,obj);
            return userRepository.save(user);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User user, User obj) {
        user.setName(obj.getName());
        user.setEmail(obj.getEmail());
        user.setPassword(obj.getPassword());
    }

}
