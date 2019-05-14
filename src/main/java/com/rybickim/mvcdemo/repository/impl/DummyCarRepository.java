package com.rybickim.mvcdemo.repository.impl;

import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Qualifier("dummy")
public class DummyCarRepository implements CarRepository {

    private static final Logger logger = LoggerFactory.getLogger(DummyCarRepository.class);

    private List<Car> cars;

    public DummyCarRepository() {
        cars = Arrays.asList(new Car("red","Bugatti","TT"),
                new Car("white","VW","Polo"),
                new Car("green","Skoda","Scala"));

        logger.debug("DummyCarRepository(), cars: {}", cars);

        readAllCars();
    }

    @Override
    public List<Car> readAllCars() {

        logger.trace("readAllCars()");
        logger.debug("readAllCars(), result: {}", cars);

        return cars;
    }
}
