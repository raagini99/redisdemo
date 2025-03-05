package com.ecommerce.redisdemo.controllers;


import com.ecommerce.redisdemo.models.Car;
import com.ecommerce.redisdemo.services.CarService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/create")
    @CachePut(key = "#car.company", value = "car") //car::Hyundai
    public @ResponseBody Car create(@RequestBody Car car) {
        return carService.createCar(car.getCompany(), car.getModel());
    }

    @GetMapping("/{id}")
    @Cacheable(value = "car")
    public Car getCar(@PathVariable("id") Long id) {
        return carService.findById(id);
    }

    @GetMapping("")
    @Cacheable(value = "car")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }
}