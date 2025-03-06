package com.ecommerce.redisdemo.services;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private final CarService carService;

    public ScheduledTask(CarService carService) {
        this.carService = carService;
    }

    // ss mm hh dd mm dayofweek
    @Scheduled(cron = "0 * * * * *")
    public void execute() {
        System.out.println("Executing Scheduled Task");
        carService.deleteAllCars();
    }
}