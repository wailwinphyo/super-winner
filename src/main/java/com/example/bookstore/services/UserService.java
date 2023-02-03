package com.example.bookstore.services;

import com.example.bookstore.dtos.UserGetDto;
import com.example.bookstore.dtos.UserPostDto;


public interface UserService {

    void save(UserPostDto userPostDto);

    UserGetDto findById(int id);
}
