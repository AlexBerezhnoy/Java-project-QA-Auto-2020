package Lec10;

public class LandLinePhone extends Phone {

    public LandLinePhone(String name, String[] phoneNumbers) {
        super(name, phoneNumbers); // new Phone// (name, phoneNumbers);
    }

    @Override
    public void changePhoneNumberFormat(String formatSymbol) {
        String[] phoneNumbers = getPhoneNumbers();
        for (int i = 0; i < phoneNumbers.length ; i++) {
            phoneNumbers[i] = phoneNumbers[i] + formatSymbol;

        }
    }

    public void printPhoneInfo(String values) { // можно перегрузить но не переопределить
            }
}
