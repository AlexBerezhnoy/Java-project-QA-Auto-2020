package Lec9.inheritance;

import java.util.Random;

public class OverPerformedPlant extends Plant {


    public OverPerformedPlant(String name, String type, int startYear) {
        super(name, type, startYear);
    }

    @Override
    public int startProduceProduction () {
        System.out.println(String.format("start Production of %s at %s", getType(), getStartYear()));

        return new Random().nextInt(10000);
    }

    public int startProduceProduction (int number) {
        System.out.println(String.format("start Production of %s at %s", getType(), getStartYear()));
        return new Random().nextInt(number);
    }
}
