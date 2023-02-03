package com.example.bookstore.services;

import com.example.bookstore.dtos.UserGetDto;
import com.example.bookstore.dtos.UserPostDto;
import com.example.bookstore.entities.User;
import com.example.bookstore.mappers.MapStructMapper;
import com.example.bookstore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MapStructMapper mapStructMapper;

    @Override
    public void save(UserPostDto userPostDto) {
        User user = mapStructMapper.userPostDtoToUser(userPostDto);
        userRepository.save(user);
    }

    @Override
    public UserGetDto findById(int id) {
        User user = userRepository.findById(id).get();
        return mapStructMapper.userToUserGetDto(user);
    }
}
