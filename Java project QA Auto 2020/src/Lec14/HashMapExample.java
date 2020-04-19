package Lec14;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

import static sun.security.krb5.internal.crypto.Nonce.value;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> fruties = new HashMap<>();
        fruties.put(1, "apple");
        fruties.put(2, "bananas");
        fruties.put(3, "orange");
        fruties.put(4, "kiwi");
        fruties.put(5, "marakuya");
        fruties.put(null, "granat");

        System.out.println("map size: " + fruties.size());
        System.out.println(fruties);

        fruties.put(3, "granat");

        System.out.println("map size: " + fruties.size());
        System.out.println(fruties);

//        String apple = fruties.get("apple");
        String apple1 = fruties.get(null);
        String apple2= fruties.getOrDefault(10, "kaktus");
        System.out.println(apple1);
        System.out.println(apple2);

        for (Map.Entry<Integer, String> entry : fruties.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

        fruties.forEach((key,value) ->{
            System.out.println(key + " : "+ value);
        });
        fruties.containsKey(2);

    }
}
