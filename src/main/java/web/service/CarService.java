package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public abstract List<Car> getCars(Integer count);
}
