package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.dto.UserDto;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();

    Optional<User> getUserByUsername(String username);
    Optional<User> getUserByEmail(String email);

    User convertToUser(UserDto userDto);
    UserDto convertToUserDto(User user);
}
