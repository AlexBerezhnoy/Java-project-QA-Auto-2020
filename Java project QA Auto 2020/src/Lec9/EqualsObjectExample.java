package Lec9;

import Lec8.sub.Pet;

public class EqualsObjectExample {
    public static void main(String[] args) {


        Pet hamster = new Pet(1, "Bob", "hamster");
        Pet hamster1 = new Pet(1, "Bob", "hamster");
        System.out.println(hamster.toString());
        hamster1.setVisitDate("22-01-2020");
        System.out.println(hamster1.toString());
        System.out.println(hamster.equals(hamster1));
        if (hamster.equals(hamster1)) {
            System.out.println("Object are equal!");
        }

    }
}
