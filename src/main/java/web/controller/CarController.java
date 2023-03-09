package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/car")
public static String carList(@RequestParam(required = false) Integer count, ModelMap model) {
        CarServiceImpl carService = new CarServiceImpl();
        var carList = carService.getCountCars(count, carService.getFiveCars());
        model.addAttribute("carlist", carList);
        return "cars";
    }

}
