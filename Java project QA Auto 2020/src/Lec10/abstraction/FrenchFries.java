package Lec10.abstraction;

public class FrenchFries extends Food {
    private String name;

    public FrenchFries(String name, int quantity) {
        super(quantity);
        this.name = name;
    }

    @Override
    public void eat(int quantity) {
        System.out.println("eat: " + name);
        int leftQuantity = getQuantity() -quantity;
        System.out.println("Left quontity:" + leftQuantity);
        setQuantity(leftQuantity);
    }

    @Override
    public String toString() {
        return "FrenchFries{" +
                "name='" + name + '\'' +
                ", quantity='" + getQuantity()+ '\'' +
                '}';
    }
}
