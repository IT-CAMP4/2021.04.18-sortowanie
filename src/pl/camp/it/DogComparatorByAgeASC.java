package pl.camp.it;

import java.util.Comparator;

public class DogComparatorByAgeASC implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge() - o2.getAge();
    }
}
