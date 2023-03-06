package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/car")
public static String carList(@RequestParam(required = false) Integer count, ModelMap model) {
        List<Car> lc = new ArrayList<>();
        lc.add(new Car("mazda", "3", 4));
        lc.add(new Car("BMW", "X5", 7));
        lc.add(new Car("TOYOTA", "X", 3));
        if(count == null) {
                model.addAttribute("carlist", lc);
        } else {
                model.addAttribute("carlist", lc.stream().limit(count).toList());
        }
        return "cars";
    }
}
