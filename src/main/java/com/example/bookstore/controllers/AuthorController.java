package com.example.bookstore.controllers;

import com.example.bookstore.dtos.AuthorAllDto;
import com.example.bookstore.mappers.MapStructMapper;
import com.example.bookstore.repositories.AuthorRepository;
import com.example.bookstore.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping()
    public ResponseEntity<List<AuthorAllDto>> getAll() {
        return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);
    }

}
