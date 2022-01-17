package com.koltashov.spring.repositories;

import com.koltashov.spring.model.Education;
import org.springframework.data.repository.CrudRepository;

public interface EducationRepository extends CrudRepository<Education, Integer> {
}
