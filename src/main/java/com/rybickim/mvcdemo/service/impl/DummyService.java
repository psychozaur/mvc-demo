package com.rybickim.mvcdemo.service.impl;

import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.repository.CarRepository;
import com.rybickim.mvcdemo.service.StartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("dummyService")
public class DummyService implements StartService {

    private CarRepository carRepository;

    public DummyService(@Qualifier("dummy") CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getMyCars() {
        return carRepository.readAllCars();
    }
}
