package Lec10;

public class PhoneMainExample {
    public static void main(String[] args) {
        String[] phoneNumbers = {"09645664", "0984646456", "06678998"};
        Phone phone = new Phone("iPhone", phoneNumbers);
        phone.printPhoneInfo();

        phone.changePhoneNumberFormat("+38");

        phone.printPhoneInfo();

        LandLinePhone landLinePhone = new LandLinePhone("home", new String[]{"09645664", "0984646456", "06678998"});
        landLinePhone.changePhoneNumberFormat("+307");
        landLinePhone.printPhoneInfo();
    }
}
