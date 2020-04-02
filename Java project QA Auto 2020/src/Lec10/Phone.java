package Lec10;

import java.util.Arrays;

public class Phone {
    private String name;
    private  String[] phoneNumbers;

    public Phone(String name, String[] phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void changePhoneNumberFormat (String formatSymbol) {
        for (int i = 0; i <phoneNumbers.length ; i++) {
            phoneNumbers[i] = formatSymbol + phoneNumbers[i];

        }
    }

    public final void printPhoneInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }
}
