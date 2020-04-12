package Lec12.exception;

public class Convertor {

    public double convertCelsiusToKelvin (double value) throws ConvertorExceprion{
        if (value < 15) {
            throw new ConvertorExceprion("Incorrect celsius value: " + value);
        }
        return value + 273.16;
    }
}