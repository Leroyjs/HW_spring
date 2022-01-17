package com.koltashov.spring.repositories;

import com.koltashov.spring.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
