package com.onlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.onlineShop.model.Address;
import com.onlineShop.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/address")
public class AddressController {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @PostMapping("/addaddress")
    //@ResponseStatus(HttpStatus.CREATED)
    public Address addAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @PutMapping("/{addressId}")
    public Address updateAddress(@PathVariable int addressId, @RequestBody Address address) {
    	return addressRepository.findById(addressId).get();
    }

    
    @DeleteMapping("/{addressId}")
    public Address removeAddress(@PathVariable int addressId) {
        Optional<Address> existingAddressOptional = addressRepository.findById(addressId);
        if (existingAddressOptional.isPresent()) {
            Address existingAddress = existingAddressOptional.get();
            addressRepository.delete(existingAddress);
            return existingAddress;
        } else {
            return null;
        }
    }
    @GetMapping("/viewalladdress")
    public List<Address> viewAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/{addressId}")
    public Address viewAddress(@PathVariable int addressId) {
        Optional<Address> addressOptional = addressRepository.findById(addressId);
        return addressOptional.orElse(null);
    }
}
