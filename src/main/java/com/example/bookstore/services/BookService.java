package com.example.bookstore.services;

import com.example.bookstore.dtos.BookDto;

public interface BookService {
    BookDto findById(int id);
}
