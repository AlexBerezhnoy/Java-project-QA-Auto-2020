package Lec12.exception;

public class ExceprionExample2 {
    public static void main(String[] args) throws ConvertorExceprion {
        Convertor convertor = new Convertor();

        double kelvin = 0;
        try {
            kelvin = convertor.convertCelsiusToKelvin(20.4);
            System.out.println("Kelvin:" + kelvin);
            double kelvin2 = convertor.convertCelsiusToKelvin(10.4);
            System.out.println("Kelvin:" + kelvin2);
        } catch (ConvertorExceprion e) {
            System.out.println(e.getMessage());
        }
    }
}
