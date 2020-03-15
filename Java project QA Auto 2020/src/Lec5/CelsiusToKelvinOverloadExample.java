package Lec5;

public class CelsiusToKelvinOverloadExample {


        public static final double KELVIN_COEFFICIENT = 273.15;
        public static void main(String[] args) {
            double celsiusDouble = 15D;
            double resultDouble = celsiusToKelvin(celsiusDouble) * 2;
            System.out.println("Kelvin x 2 :" + resultDouble );
            int celsiusInt = 25;
            double resultInt = celsiusToKelvin(celsiusInt);
            System.out.println("Kelvin x 3 :" + resultInt * 3);
        }

        public static double celsiusToKelvin (double celsius) {
            double result = celsius + KELVIN_COEFFICIENT;
            System.out.println("Celsius to Kelvin with double: " + result);
            return result;
        }

        public static double celsiusToKelvin (int celsius) {
           double result = celsius + KELVIN_COEFFICIENT;
            System.out.println("Celsius to Kelvin with int: " + result);
           return result;
    }
}

