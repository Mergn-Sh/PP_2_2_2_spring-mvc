package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getAmountOfCars(List<Car> cars, int amountCars) {
        if(amountCars > 5){
            amountCars = amountCars - (amountCars - 5);
        }
        List<Car> subList = cars.subList(amountCars, 5);
        cars.removeAll(subList);

    return cars;
    }
}
