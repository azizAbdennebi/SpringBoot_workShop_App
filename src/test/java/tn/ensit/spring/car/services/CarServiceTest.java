package tn.ensit.spring.car.services;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.util.Pair;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    @Test
    public void contains_shoud_return_if_element_in_list(){
        //arrange
        ICarService service =new CarService();
        var list =List.of(1,2,3,4);
        //act
        Boolean result =service.contains(list,3);

        //assert
        Assertions.assertThat(result).isEqualTo(true);
        Assertions.assertThat(result).isEqualTo(true);

    }

    @Test
    public  void contains_should_return_true_if_the_list_contains_the_number(){
        //arrange
        ICarService service =new CarService();
        List<Integer> list =List.of(1,2,3,4,5);

        var pair1 = Pair.of(3,true);
        var pair2 = Pair.of(6,false);
        var testList = List.of(pair1,pair2);


        testList.forEach( pair->{


                    //act
                    Boolean result=service.contains(list,pair.getFirst());
                    //assert
                    Assertions.assertThat(result).isEqualTo(pair.getSecond());

                }

        );



    }

    @Test
    public void sizeof_should_return_size_of_list(){
        //arrange
        ICarService service =new CarService();
        var list =List.of(1,2,3,4);
        //act
        Integer result =service.sizeof(list);

        //assert
        Assertions.assertThat(result).isEqualTo(4);

    }
}