package tn.ensit.spring.car.entities;

import tn.ensit.spring.person.entities.Person;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "voiture")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String model;

   /* @ManyToMany()
    @JoinColumn(name = "person_id")
    private List<Person> persons;*/

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getId(), car.getId()) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel());
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
