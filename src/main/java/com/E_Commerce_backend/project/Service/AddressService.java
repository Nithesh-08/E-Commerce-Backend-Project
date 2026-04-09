package com.E_Commerce_backend.project.Service;


import com.E_Commerce_backend.project.DTO.AddressDTO;

import java.util.List;

public interface AddressService {

    AddressDTO create(AddressDTO dto);
    List<AddressDTO> getAll();
    AddressDTO getById(Integer id);
    AddressDTO update(Integer id, AddressDTO dto);
    void delete(Integer id);
}
