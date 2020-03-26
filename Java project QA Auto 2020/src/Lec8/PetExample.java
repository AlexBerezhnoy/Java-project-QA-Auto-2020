package Lec8;

import Lec8.sub.Pet;

public class PetExample {
    public static void main(String[] args) {
        Pet cat = new Pet(1, "Garfild", "cat" );
        System.out.println(cat.getId());
        System.out.println(cat.getName());
        System.out.println(cat.getType());
        System.out.println(cat.getVisitDate());

        cat.setVisitDate("20/03/2020");
        System.out.println(cat.getVisitDate());
    }
}
