package tn.ensit.spring.car.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    @Override
    public Boolean contains(List<Integer> list, Integer number) {

        return (list.contains(number));
    }

    @Override
    public Integer sizeof(List<Integer> list) {
        return list.size();
    }
}
