package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public static int getTotalFromCarsList(List<Car> car) {
        return car.size();
    }
}
