package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.Entity.User;
import com.E_Commerce_backend.project.DTO.UserDTO;
import com.E_Commerce_backend.project.Exception.*;
import com.E_Commerce_backend.project.Mapper.UserMapper;
import com.E_Commerce_backend.project.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO dto) {

        if (userRepository.findByUserEmail(dto.getUserEmail()).isPresent()) {
            throw new AlreadyExistsException("Email already exists");
        }

        User user = UserMapper.toEntity(dto);
        return UserMapper.toDTO(userRepository.save(user));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return UserMapper.toDTO(user);
    }

    @Override
    public UserDTO updateUser(Integer id, UserDTO dto) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        user.setUserName(dto.getUserName());
        user.setUserEmail(dto.getUserEmail());
        user.setUserPhoneNo(dto.getUserPhoneNo());
        user.setUserPassword(dto.getUserPassword());

        return UserMapper.toDTO(userRepository.save(user));
    }

    @Override
    public void deleteUser(Integer id) {

        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("User not found");
        }

        userRepository.deleteById(id);
    }
}
