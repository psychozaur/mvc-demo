package com.rybickim.mvcdemo.service.impl;

import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.repository.CarRepository;
import com.rybickim.mvcdemo.service.StartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("startService")
public class StartServiceImpl implements StartService {

    private CarRepository carRepository;

    public StartServiceImpl(@Qualifier("dummy") CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public CarRepository getCarRepository() {
        return carRepository;
    }

    @Override
    public List<Car> getMyCars() {
        return null;
    }
}
