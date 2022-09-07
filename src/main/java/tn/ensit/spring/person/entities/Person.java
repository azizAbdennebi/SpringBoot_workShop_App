package tn.ensit.spring.person.entities;

import tn.ensit.spring.car.entities.Car;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "personne")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "car_Person",
    joinColumns=@JoinColumn(name = "car_Id" ,referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(
            name = "person_Id",
            referencedColumnName = "id"
    ))
    private List<Car> car;



    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId().equals(person.getId()) && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
