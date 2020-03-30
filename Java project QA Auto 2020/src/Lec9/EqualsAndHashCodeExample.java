package Lec9;

import Lec8.sub.Pet;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodeExample {
    public static void main(String[] args) {
    Pet hamster = new Pet(1, "Bob", "hamster");
    Pet hamster1 = new Pet(1, "Bob", "hamster");

//    hamster1.setVisitDate("22-01-2020");
        System.out.println(hamster.hashCode());
        System.out.println(hamster1.hashCode());
    System.out.println(hamster.equals(hamster1));
    if (hamster.equals(hamster1)) {
        System.out.println("Object are equal!");
    }
        Set <Pet> pets = new HashSet<>();
    pets.add(hamster);
    pets.add(hamster1);
        System.out.println(pets.size());

}
}
