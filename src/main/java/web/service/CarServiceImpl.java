package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final List<Car> cars = new ArrayList<>(Arrays.asList(new Car("car1", 123, 1990),
            new Car("car1", 123, 1990),
            new Car("car1", 123, 1990),
            new Car("car1", 123, 1990),
            new Car("car1", 123, 1990)));

    @Override
    public List<Car> getAmountOfCars(int amountCars) {
        if(amountCars > 5){
            amountCars = amountCars - (amountCars - 5);
        }
        List<Car> subList = cars.subList(amountCars, 5);
        cars.removeAll(subList);

    return cars;
    }
}
