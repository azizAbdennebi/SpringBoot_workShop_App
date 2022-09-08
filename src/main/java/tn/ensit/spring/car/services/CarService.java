package tn.ensit.spring.car.services;

import org.springframework.stereotype.Service;
import tn.ensit.spring.car.entities.Car;
import tn.ensit.spring.car.repositories.CarRepository;

import java.util.List;

@Service
public class CarService implements ICarService {

    CarRepository repository;

    @Override
    public Boolean contains(List<Integer> list, Integer number) {

        return (list.contains(number));
    }

    @Override
    public Integer sizeof(List<Integer> list) {
        return list.size();
    }

    @Override
    public Car getByModel(String model) {
        return repository.findByModel(model);
    }

    @Override
    public Car getById(long id) {
        return null;
    }


}
