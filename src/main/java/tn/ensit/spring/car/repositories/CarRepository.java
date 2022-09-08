package tn.ensit.spring.car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ensit.spring.car.entities.Car;

@Repository
public interface CarRepository extends JpaRepository <Car, Long> {
    Car findByModel(String model);
}
