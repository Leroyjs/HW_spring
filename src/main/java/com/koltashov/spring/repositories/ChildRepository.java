package com.koltashov.spring.repositories;

import com.koltashov.spring.model.Child;
import org.springframework.data.repository.CrudRepository;

public interface ChildRepository extends CrudRepository<Child, Integer> {
}
