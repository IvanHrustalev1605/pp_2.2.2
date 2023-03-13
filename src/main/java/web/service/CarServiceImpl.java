package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

   private static List<Car> lc = new ArrayList<>();

    static {
        lc.add(new Car("mazda", "3", 4));
        lc.add(new Car("BMW", "X5", 7));
        lc.add(new Car("TOYOTA", "X", 3));
        lc.add(new Car("MERCEDES", "E", 7));
        lc.add(new Car("TOYOTA", "Land Cruiser", 4));
    }


    @Override
    public  List<Car> getCars(Integer count) {
       if(count == null) {
           return lc;
       } else if (count >= 5) {
           return lc.stream().limit(count).toList();
       }
       return null;
    }
}
