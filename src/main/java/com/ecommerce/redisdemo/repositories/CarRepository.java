package com.ecommerce.redisdemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.redisdemo.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {


}