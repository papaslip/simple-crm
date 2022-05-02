package com.example.crmoriginalshop.repository;

import com.example.crmoriginalshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

