package com.ecommerce.redisdemo.services;


import com.ecommerce.redisdemo.models.Car;
import com.ecommerce.redisdemo.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car findById(Long id) {
        return carRepository.findById(id).get();
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car createCar(String company, String model) {
        Car car = new Car();
        car.setCompany(company);
        car.setModel(model);
        return carRepository.save(car);
    }

    public void deleteAllCars() {
        carRepository.deleteAll();
    }
}