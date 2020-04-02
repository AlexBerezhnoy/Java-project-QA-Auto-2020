package Lec10.abstraction;

public class Pasta extends Food {

    public Pasta(int quantity) {
        super(quantity);
    }

    public void addFood (int quantity ) {

    }

    @Override
    public void eat(int quantity) {
        int leftQuantity = getQuantity() - quantity;
        System.out.println("Left pasta quontity:" + leftQuantity);
        setQuantity(leftQuantity);
    }

    @Override
    public String toString() {
        return "Pasta{}";
    }
}
