package com.rybickim.mvcdemo.controller.impl;

import com.rybickim.mvcdemo.controller.HomeController;
import com.rybickim.mvcdemo.domain.Car;
import com.rybickim.mvcdemo.service.StartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeControllerImpl implements HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeControllerImpl.class);

    private StartService startService;

    public HomeControllerImpl(@Qualifier("dummyService") StartService startService) {
        this.startService = startService;
    }

    @GetMapping({"/", "/home"})
    @Override
    public String homePage(Model dataModel) {
        logger.debug("homePage()");

        //jeśli Car będzie encją, nie zwracajmy go w kontrolerze
        List<Car> carsToShow = startService.getMyCars();

        dataModel.addAttribute("cars", carsToShow);

        return "cars";
    }
}
