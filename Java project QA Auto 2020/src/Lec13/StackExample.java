package Lec13;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Alex");
        stack.add("Bob");
        stack.add("Anna");

        String pop = stack.pop();
        System.out.println("Pop :  " + pop);

    }
}
