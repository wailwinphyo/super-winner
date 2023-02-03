package com.example.bookstore.controllers;

import com.example.bookstore.dtos.UserGetDto;
import com.example.bookstore.dtos.UserPostDto;
import com.example.bookstore.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<Void> create(
            @Valid @RequestBody UserPostDto userPostDto
            ){

        userService.save(userPostDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserGetDto> getById(@PathVariable(value = "id")int id){
        return new ResponseEntity<>(
                userService.findById(id), HttpStatus.OK
        );
    }
}
