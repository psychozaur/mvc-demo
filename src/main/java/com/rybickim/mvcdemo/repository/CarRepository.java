package com.rybickim.mvcdemo.repository;

import com.rybickim.mvcdemo.domain.Car;

import java.util.List;

public interface CarRepository {

    List<Car> readAllCars();
}
