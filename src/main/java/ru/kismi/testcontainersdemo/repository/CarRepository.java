package ru.kismi.testcontainersdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kismi.testcontainersdemo.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
