package Lec5;

public class SumOfGivenArrayMethodExample {
    public static void main(String[] args) {
//        int [] array = new int [5];
//        array[0]= 38;
//        array[1]= 135;
//        array[2]= 456;
//        for (int value : array) {
//            System.out.println(value);
//        }

        int [] arrayFibonacci = {1, 1, 2, 3, 5, 8, 13, 21};
        int arraySumResult = arraySumCalculation(arrayFibonacci);
        System.out.println("Array number sum result: " + arraySumResult);

        int [] arraySimple = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arraySumResult = arraySumCalculation(arraySimple);
        System.out.println("Array number sum result: " + arraySumResult);
    }

    public  static  int arraySumCalculation (int[] array) {
        int sumValuesResult = 0;
        for (int value : array) {
            sumValuesResult += value;
        }
        return sumValuesResult;
    }

//public  static  int arraySumCalculation (int[] array) {
//        int sumValuesResult = 0;
//        int previosValue = 0;
//        for (int currentValue : array) {
//            sumValuesResult = previosValue + currentValue;
//            previosValue = sumValuesResult;
//        }
//        return sumValuesResult;
//    }
}
