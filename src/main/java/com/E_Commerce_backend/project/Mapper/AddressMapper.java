package com.E_Commerce_backend.project.Mapper;

import com.E_Commerce_backend.project.Entity.Address;
import com.E_Commerce_backend.project.DTO.AddressDTO;

public class AddressMapper {

    public static AddressDTO toDTO(Address address) {

        if (address == null) return null;

        AddressDTO dto = new AddressDTO();

        dto.setAddressId(address.getAddressId());
        dto.setAddressName(address.getAddressName());
        dto.setAddressLandmark(address.getAddressLandMark());
        dto.setAddressState(address.getAddressState());
        dto.setAddressPhoneNumber(address.getAddressPhoneNumber());
        dto.setAddressZipCode(address.getAddressZipCode());

        if (address.getUser() != null) {
            dto.setUserId(address.getUser().getUserId());
        }

        return dto;
    }

    public static Address toEntity(AddressDTO dto) {

        if (dto == null) return null;

        Address address = new Address();

        address.setAddressId(dto.getAddressId());
        address.setAddressName(dto.getAddressName());
        address.setAddressLandMark(dto.getAddressLandmark());
        address.setAddressState(dto.getAddressState());
        address.setAddressPhoneNumber(dto.getAddressPhoneNumber());
        address.setAddressZipCode(dto.getAddressZipCode());

        return address;
    }
}