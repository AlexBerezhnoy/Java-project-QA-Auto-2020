package Lec4;

public class WhileLoopsExample {
    public static void main(String[] args) {
        int number = 1;

        while (number ==1) {

            System.out.println("Inside while");
            number = 2;
            System.out.println("After change while condition");
        }

        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
    }
}
