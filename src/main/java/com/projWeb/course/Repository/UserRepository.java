package com.projWeb.course.Repository;

import com.projWeb.course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
