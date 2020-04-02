package Lec10.abstraction;

public class Restoran {
    private  String name;
    private Food food;

    public Restoran(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }
}
