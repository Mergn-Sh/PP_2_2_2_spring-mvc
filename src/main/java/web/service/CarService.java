package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAmountOfCars(List<Car> cars, int amountCars);
}
