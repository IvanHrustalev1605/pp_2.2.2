package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
   private static List<Car> lc;
   public static List<Car> getCars(Integer count) {
       lc = new ArrayList<>();
       lc.add(new Car("mazda", "3", 4));
       lc.add(new Car("BMW", "X5", 7));
       lc.add(new Car("TOYOTA", "X", 3));
       lc.add(new Car("MERCEDES", "E", 7));
       lc.add(new Car("TOYOTA", "Land Cruiser", 4));
       if(count == null) {
           return lc;
       } else {
           return lc.stream().limit(count).toList();
       }
    }
}
