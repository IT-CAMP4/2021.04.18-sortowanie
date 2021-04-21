package pl.camp.it;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "5", 300000));
        cars.add(new Car("Toyota", "Corolla", 120000));
        cars.add(new Car("Ford", "Focus", 100000));
        cars.add(new Car("Honda", "Civic", 90000));
        cars.add(new Car("Honda", "Accord", 100000));
        cars.add(new Car("Honda", "Accord", 140000));
        cars.add(new Car("Porsche", "911", 800000));
        cars.add(new Car("Fiat", "Panda", 60000));

        System.out.println(cars);

        Collections.sort(cars);

        System.out.println(cars);

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Reksio", 10));
        dogs.add(new Dog("Max", 3));
        dogs.add(new Dog("Azor", 7));
        dogs.add(new Dog("Burek", 5));

        System.out.println(dogs);

        PorownywaczPsowPoImionachMalejaco nameComparator = new PorownywaczPsowPoImionachMalejaco();
        Collections.sort(dogs, nameComparator);

        System.out.println(dogs);

        Collections.sort(dogs, new DogComparatorByAgeASC());

        System.out.println(dogs);
    }
}
