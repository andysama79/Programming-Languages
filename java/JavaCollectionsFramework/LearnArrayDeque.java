import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>(); // methods of Queue, too, work here

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(60);

        // pollLast(), pollFirst() are some additional methods

        System.out.println(adq);
    }
}