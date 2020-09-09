package com.javaguides.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaguides.springboot.entity.User;
import com.javaguides.springboot.repository.UserRepository;

@Service
public class UserService
{
    @Autowired
	private UserRepository repository;
    

	
}
