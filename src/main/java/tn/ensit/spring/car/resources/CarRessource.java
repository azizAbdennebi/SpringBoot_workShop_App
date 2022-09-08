package tn.ensit.spring.car.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.ensit.spring.car.entities.Car;
import tn.ensit.spring.car.services.ICarService;

@RestController
public class CarRessource {
    @Autowired
    private ICarService service;

    @GetMapping("/car/{model}")
    public Car getByModel(@PathVariable String model){
        return service.getByModel(model);
    }

    @GetMapping("/car")
    public Car getById(@RequestParam("id") Long id){
        return service.getById(id);
    }
}
