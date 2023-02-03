package com.example.bookstore.services;

import com.example.bookstore.dtos.AuthorAllDto;
import com.example.bookstore.entities.Author;
import com.example.bookstore.mappers.MapStructMapper;
import com.example.bookstore.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    MapStructMapper mapStructMapper;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<AuthorAllDto> findAll() {
        List<Author> authors = authorRepository.findAll();
        return mapStructMapper.authorsToAuthorAllDtos(authors);
    }
}
