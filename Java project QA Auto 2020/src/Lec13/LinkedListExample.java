package Lec13;

import java.util.LinkedList;

public class LinkedListExample {

       public static void main(String[] args) {

           LinkedList <String> linkedList = new LinkedList();
           linkedList.add("Alex");
           linkedList.add("Bob");
           linkedList.add("Anna");
           linkedList.add("John");
           linkedList.add("Vasiliy");
           linkedList.add("Bob");

           System.out.println(linkedList.size());
           System.out.println(linkedList.get(2));

           String first = linkedList.getFirst();
           System.out.println("First: = "+first);
           String last = linkedList.getLast();
           System.out.println("Last: = "+last);

           String remove = linkedList.remove();
           System.out.println(remove);

           linkedList.remove(2); // 1-> <-2-> <-3-> <-4

       }

}
