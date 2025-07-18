package com.projetocadastro.system.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocadastro.system.models.User;

public interface UserController extends JpaRepository<User, Long> {
}
