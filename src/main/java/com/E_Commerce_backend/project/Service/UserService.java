package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.DTO.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO dto);

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Integer id);

    UserDTO updateUser(Integer id, UserDTO dto);

    void deleteUser(Integer id);
}
