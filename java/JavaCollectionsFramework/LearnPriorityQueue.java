import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); // ? minHeap // all methods of Queue also work in PriorityQueue

        // ? Queue<Integer> pq = new PriorityQueue<>(Comparator.reverserder()); // maxHeap

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);
    }
}
