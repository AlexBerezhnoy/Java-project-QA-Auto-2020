package Lec13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Alex");
        stringSet.add("Bob");
        stringSet.add("Bob"); // Dont add
        stringSet.add("Anna");
        stringSet.add("John");
        stringSet.add("Viktor");

        System.out.println(stringSet);

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
