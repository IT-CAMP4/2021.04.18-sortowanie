package pl.camp.it;

import java.util.Comparator;

public class PorownywaczPsowPoImionachMalejaco implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return -o1.getName().compareTo(o2.getName());
    }
}
