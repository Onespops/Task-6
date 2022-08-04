package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars() {
        cars.add(new Car("RangeRover", "White", 777));
        cars.add(new Car("Mercedes", "Black", 171));
        cars.add(new Car("BMW", "Grey", 234));
        cars.add(new Car("Porsche", "Red", 456));
        return cars;
    }

    public List<Car> getCars(int count) {
        List<Car> allCars = new CarService().getAllCars();

        if (count >= allCars.size()) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}
