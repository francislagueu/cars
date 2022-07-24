package com.osiris.carbackend.repositories;

import com.osiris.carbackend.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
