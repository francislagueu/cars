package com.osiris.carbackend.controller;

import com.osiris.carbackend.domain.Car;
import com.osiris.carbackend.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cars")
@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }
}
