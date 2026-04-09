package com.E_Commerce_backend.project.Service;

import com.E_Commerce_backend.project.DTO.AddressDTO;
import com.E_Commerce_backend.project.Entity.Address;
import com.E_Commerce_backend.project.Entity.User;
import com.E_Commerce_backend.project.Exception.ResourceNotFoundException;
import com.E_Commerce_backend.project.Mapper.AddressMapper;
import com.E_Commerce_backend.project.Repository.AddressRepository;
import com.E_Commerce_backend.project.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository repo;
    private final UserRepository userRepo;

    public AddressDTO create(AddressDTO dto) {

        Address address = AddressMapper.toEntity(dto);

        User user = userRepo.findById(dto.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        address.setUser(user);

        return AddressMapper.toDTO(repo.save(address));
    }

    public List<AddressDTO> getAll() {
        return repo.findAll().stream()
                .map(AddressMapper::toDTO).toList();
    }

    public AddressDTO getById(Integer id) {
        Address a = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found"));
        return AddressMapper.toDTO(a);
    }

    public AddressDTO update(Integer id, AddressDTO dto) {

        Address a = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found"));

        a.setAddressName(dto.getAddressName());
        a.setAddressLandMark(dto.getAddressLandmark());
        a.setAddressState(dto.getAddressState());
        a.setAddressPhoneNumber(dto.getAddressPhoneNumber());
        a.setAddressZipCode(dto.getAddressZipCode());

        return AddressMapper.toDTO(repo.save(a));
    }

    public void delete(Integer id) {
        if (!repo.existsById(id))
            throw new ResourceNotFoundException("Address not found");

        repo.deleteById(id);
    }
}