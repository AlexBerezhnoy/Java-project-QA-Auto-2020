package Lec13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alex");
        queue.add("Bob");
        queue.add("Anna");
        queue.add("John");

        System.out.println(queue);


        String poll =  queue.poll();

        System.out.println("poll: " + poll);
        System.out.println(queue);

        String peek =  queue.peek();

        System.out.println("peek: " + peek);
        System.out.println(queue);

        System.out.println("Remove: " + queue.remove());
        System.out.println(queue);
        queue.element();

    }
}
