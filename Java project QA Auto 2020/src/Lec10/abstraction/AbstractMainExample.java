package Lec10.abstraction;

public class AbstractMainExample {
    public static void main(String[] args) {

        Restoran mcdak = new Restoran("McDack", new FrenchFries("FrenchFries",10) );
        Food mcdakFood = mcdak.getFood();
        mcdakFood.eat(5);

        Restoran italian = new Restoran("McDack", new Pasta(100));
        italian.getFood().eat(19);

        if (mcdakFood instanceof FrenchFries) {
            System.out.println("TRUE");
        } else {
            System.out.println("False");
        }

//        mcdak.getFood().addFood;
    }
}
