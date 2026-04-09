package com.E_Commerce_backend.project.Controller;

import com.E_Commerce_backend.project.DTO.UserDTO;
import com.E_Commerce_backend.project.Service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserDTO create(@Valid @RequestBody UserDTO dto) {
        return userService.createUser(dto);
    }

    @GetMapping
    public List<UserDTO> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public UserDTO update(@PathVariable Integer id,
                          @Valid @RequestBody UserDTO dto) {
        return userService.updateUser(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}