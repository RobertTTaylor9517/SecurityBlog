package com.roberttaylor.securitydemo.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberttaylor.securitydemo.entities.User;

public interface UserDAO extends JpaRepository<User, UUID> {

}
