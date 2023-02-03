package com.example.bookstore.services;

import com.example.bookstore.dtos.AuthorAllDto;

import java.util.List;

public interface AuthorService {
    List<AuthorAllDto> findAll();
}
