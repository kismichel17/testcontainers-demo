package ru.kismi.testcontainersdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kismi.testcontainersdemo.entity.Car;
import ru.kismi.testcontainersdemo.repository.CarRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarRepository carRepository;

    @GetMapping("")
    public List<Car> saveCars() {
        Car car1 = new Car(1L, "Audi");
        Car car2 = new Car(2L, "Mersedes");
        Car car3 = new Car(3L, "Lada");
        return carRepository.saveAll(List.of(car1, car2, car3));
    }
}