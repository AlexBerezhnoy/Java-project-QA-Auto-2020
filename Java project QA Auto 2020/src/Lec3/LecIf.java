package Lec3;

public class LecIf {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("Вход на сайт:");
//        if (age >= 18) {
//            System.out.println("Вход разрешен");
//        } else {
//            System.out.println("Ограниченый доступ");
//        }
        if (age >= 18) {
            System.out.println("Вход разрешен");
        } else if (age < 18 && age >= 16) {
            System.out.println("Ограниченый доступ для подростков");
        } else if (age == 15 || age == 30) {
            System.out.println("Winner!!!");
        } else if (age != 25) {
            System.out.println("Not luck boy or girl!");
        }
    }

}
