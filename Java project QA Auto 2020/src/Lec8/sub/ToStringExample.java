package Lec8.sub;

public class ToStringExample {
    public static void main(String[] args) {
        Pet cat = new Pet(1, "Garfild", "cat");
        System.out.println(cat);
//        cat.toString();

        Pet dog = new Pet(2, "Bethoven", "dog");
        System.out.println(dog);

        System.out.println(cat.getClass().getName());
        System.out.println(cat.getClass().getSimpleName());
    }
}
