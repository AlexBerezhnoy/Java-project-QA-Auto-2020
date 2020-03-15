package Lec4;

import java.util.stream.Stream;

public class LambdaForEach {
    public static void main(String[] args) {
        String[] cars = {"Subaru", "Mazda", "Toyota", "Ford", "Audi"};
//        for (String car : cars) {
//
//            System.out.println(car);
//        }
//        Stream.of(cars).
//                forEach(car -> {
//            System.out.println(car);
//        });
        Stream.of(cars).forEach(System.out::println);
        
    }
}
