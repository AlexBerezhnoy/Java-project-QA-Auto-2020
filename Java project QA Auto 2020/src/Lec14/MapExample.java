package Lec14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, Fruit> fruitMap = new HashMap<>();
        long start = System.nanoTime();
        fruitMap.put (3, new Fruit(1, "apple"));
        fruitMap.put (1, new Fruit(2, "bananas"));
        fruitMap.put (6, new Fruit(3, "orange"));
        fruitMap.containsKey(1);
        long stop = System.nanoTime();

        System.out.println(stop - start);


        System.out.println(fruitMap);


    }
}
