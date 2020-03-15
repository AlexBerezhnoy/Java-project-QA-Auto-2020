package Lec4;

import java.util.Objects;

public class ForLoopsExample {
    public static void main(String[] args) {
        String[] names = {"Ivan", "John", "Anna", "Piter"};

        if (Objects.nonNull(names) && names.length!=0) {
            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);
            System.out.println();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("i = "+ i);
            System.out.println(names[i]);
        }
        for (int i = names.length; i > 0; i--) {
            System.out.println("i = "+ (i-1));
            System.out.println(names[i-1]);
        }
    }
}
