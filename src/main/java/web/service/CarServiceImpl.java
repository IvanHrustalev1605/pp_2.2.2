package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    public  int getTotalFromCarsList(List<Car> car) {
        return car.size();
    }
    @Override
    public List<Car> getFiveCars() {
        List<Car> lc = new ArrayList<>();
        lc.add(new Car("mazda", "3", 4));
        lc.add(new Car("BMW", "X5", 7));
        lc.add(new Car("TOYOTA", "X", 3));
        lc.add(new Car("MERCEDES", "E", 7));
        lc.add(new Car("TOYOTA", "Land Cruiser", 4));
        return lc;
    }
    @Override
    public List<Car> getCountCars(Integer count, List<Car> carList) {
        if(count == null) {
            return carList;
        } else {
            return carList.stream().limit(count).toList();
        }
    }

}
