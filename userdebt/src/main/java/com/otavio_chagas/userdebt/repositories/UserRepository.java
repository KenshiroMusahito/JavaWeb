package com.otavio_chagas.userdebt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otavio_chagas.userdebt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
