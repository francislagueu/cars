package com.osiris.carbackend;

import com.osiris.carbackend.domain.Car;
import com.osiris.carbackend.domain.Owner;
import com.osiris.carbackend.repositories.CarRepository;
import com.osiris.carbackend.repositories.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class CarBackendApplication implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {

        SpringApplication.run(CarBackendApplication.class, args);
        log.info("Car Backend Application started...");
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("John", "Johnson");
        Owner owner2 = new Owner("Mary", "Robinson");

        ownerRepository.saveAll(Arrays.asList(owner1, owner2));
        Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000.00, owner1);
        Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000.00, owner2);
        Car car3 = new Car("Toyota", "Prius", "Silver", "KKo-0212", 2020, 39000.00, owner1);

        carRepository.saveAll(Arrays.asList(car1, car2, car3));

    }
}
