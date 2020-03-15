package Lec4;

public class BreakLoopsExample {
    public static void main(String[] args) {
        int[] numbers = {2,4,7,8,10,15};

//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//            if (number % 2 != 0) {
//                System.out.println("Odd number: "+number);
//                break;
//            }
//            System.out.println("Number: " + number);
//        }

        for (int i = 0; i <numbers.length ; i++) {
            int number = numbers[i];
            if (number % 2 != 0) {
                System.out.println("Odd number: "+number);
                continue;
            }
            System.out.println("Even number: " + number);
         }
    }
}
