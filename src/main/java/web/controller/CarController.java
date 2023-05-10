package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int amount, ModelMap model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 123, 1990));
        cars.add(new Car("car2", 321, 1991));
        cars.add(new Car("car3", 456, 1992));
        cars.add(new Car("car4", 654, 1993));
        cars.add(new Car("car5", 789, 1994));

        model.addAttribute("carList", carService.getAmountOfCars(cars, amount));
        return "cars";
    }
}
