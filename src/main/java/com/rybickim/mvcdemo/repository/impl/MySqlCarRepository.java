package com.rybickim.mvcdemo.repository.impl;

import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("standard")
public class MySqlCarRepository implements CarRepository {

    @Override
    public List<Car> readAllCars() {
        return null;
    }
}
