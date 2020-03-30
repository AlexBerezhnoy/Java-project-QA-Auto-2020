package Lec9.inheritance;

import java.util.Random;

public class Plant {
    private String name;
    private String type;
    private int startYear;

    public Plant(String name, String type, int startYear) {
        this.name = name;
        this.type = type;
        this.startYear = startYear;
    }

    public String getName() {
        return name;
    }

    public int getStartYear() {
        return startYear;
    }


    public String getType() {
        return type;
    }


    public int startProduceProduction () {
        System.out.println(String.format("start Production of %s at %s", this.type, this.startYear));
//        return (int) Math.random();
        return new Random().nextInt(1000);
    }
}
