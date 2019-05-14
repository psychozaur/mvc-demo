package com.rybickim.mvcdemo.controller.impl;

import com.rybickim.mvcdemo.controller.HomeRestController;
import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeRestControllerImpl implements HomeRestController {

    private static final Logger logger = LoggerFactory.getLogger(HomeRestControllerImpl.class);

    private StartService startService;

    @Autowired
    public HomeRestControllerImpl(@Qualifier("dummyService") StartService startService){
        this.startService = startService;
    }

    @GetMapping("/rest/cars")
    @Override
    public List<Car> myBestCars() {
        logger.debug("myBestCars()");

        return startService.getMyCars();
    }
}
