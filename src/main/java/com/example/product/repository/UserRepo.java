package com.example.product.repository;

import com.example.product.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
//    public List<User> findAllByFirstnameAsc();
}
