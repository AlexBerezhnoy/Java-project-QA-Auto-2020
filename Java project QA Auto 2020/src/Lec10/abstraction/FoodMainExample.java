package Lec10.abstraction;

public class FoodMainExample {

    public static void main(String[] args) {
//        Food pasta = new Food ("pasta", 100);

        FrenchFries frenchFries = new FrenchFries("FrenchFries",10 );
        frenchFries.eat(1);
        frenchFries.eat(5);
        Pasta pasta = new Pasta( 100);
        pasta.eat(10);
        pasta.eat(19);
    }
}