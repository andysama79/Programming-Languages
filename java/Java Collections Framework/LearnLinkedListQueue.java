import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // adding elements
        queue.offer("Arnab");
        queue.offer("Ankit");
        queue.offer("Kaustubh");
        queue.offer("Mangesh");
        queue.offer("Vikas");

        System.out.println(queue);

        System.out.println(queue.peek()); // returns next in line
        System.out.println(queue.poll()); // removes next in line and returns the same
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
