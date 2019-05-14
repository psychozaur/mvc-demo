package com.rybickim.mvcdemo.repository.impl;

import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.repository.CarRepository;
import com.rybickim.mvcdemo.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class DummyDummy implements StartService {

    private static final Logger logger = LoggerFactory.getLogger(DummyDummy.class);

    private CarRepository carRepository;

    public DummyDummy(@Qualifier("dummy") CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getMyCars() {
        logger.debug("getMyCars()");

        return null;
    }
}
