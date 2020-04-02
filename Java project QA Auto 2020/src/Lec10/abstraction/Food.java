package Lec10.abstraction;

public abstract class Food {

    public abstract void eat(int quantity);

    private int quantity;


    public Food( int quantity) {
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
