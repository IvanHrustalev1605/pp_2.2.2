package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public  int getTotalFromCarsList(List<Car> car);
    public List<Car> getFiveCars();
    public List<Car> getCountCars(Integer count, List<Car> carList);
}
