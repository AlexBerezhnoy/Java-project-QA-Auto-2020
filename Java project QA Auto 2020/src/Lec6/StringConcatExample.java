package Lec6;

public class StringConcatExample {
    public static void main(String[] args) {
        String userName = "Ivan";
        String userLastName = "Ivanov";

        long start = System.nanoTime();
        System.out.println("User: " +userName + " " + userLastName);
        long stop =  System.nanoTime();
        System.out.println(stop - start);

        start = System.nanoTime();
        System.out.println("User: ".concat(userName.concat(" ").concat(userLastName)));
        stop =  System.nanoTime();
        System.out.println(stop - start);

        String s = new String();
    }
}
