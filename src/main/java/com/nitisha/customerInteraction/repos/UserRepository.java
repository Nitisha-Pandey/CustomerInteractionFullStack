package com.nitisha.customerInteraction.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitisha.customerInteraction.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
