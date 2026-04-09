package com.E_Commerce_backend.project.Mapper;



import com.E_Commerce_backend.project.Entity.User;
import com.E_Commerce_backend.project.DTO.UserDTO;

public class UserMapper {

    public static UserDTO toDTO(User user) {

        if (user == null) return null;

        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUserName(user.getUserName());
        dto.setUserEmail(user.getUserEmail());
        dto.setUserPhoneNo(user.getUserPhoneNo());
        dto.setUserPassword(user.getUserPassword()); // optional

        return dto;
    }

    public static User toEntity(UserDTO dto) {

        if (dto == null) return null;

        User user = new User();
        user.setUserId(dto.getUserId());
        user.setUserName(dto.getUserName());
        user.setUserEmail(dto.getUserEmail());
        user.setUserPhoneNo(dto.getUserPhoneNo());
        user.setUserPassword(dto.getUserPassword());

        return user;
    }
}
