package com.example.bookstore.services;

import com.example.bookstore.dtos.BookDto;
import com.example.bookstore.entities.Book;
import com.example.bookstore.mappers.MapStructMapper;
import com.example.bookstore.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private MapStructMapper mapStructMapper;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDto findById(int id) {
        Book book = bookRepository.findById(id).get();
        return mapStructMapper.bookToBookDto(book);
    }
}
