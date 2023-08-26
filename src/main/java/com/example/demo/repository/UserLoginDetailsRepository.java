package com.example.demo.repository;

import com.example.demo.model.UserLoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginDetailsRepository extends JpaRepository<UserLoginDetails, Long> {
    
}
