package Lec4;

public class ArraysExample  {
    public static void main(String[] args) {
        int[] emptyNumber = {};

        System.out.println(emptyNumber.length);

        int[] numbers = {1,2,3,4};
        System.out.println(numbers.length);
        System.out.println(numbers[3]);
        System.out.println(numbers[2]);

        String[] names = {"Ivan", "John", "Anna"};
        System.out.println(names);
        System.out.println(names[0]);
    }
}
