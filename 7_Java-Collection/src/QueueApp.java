import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    /**
     * Queue -> implementasi dari struktur data Antrian atau FIFO (First In First Out)
     * ArrayDeque vs LinkedList vs PriorityQueue
     * - ArrayDeque -> menggunakan array sbg implementasi queue
     * - LinkedList -> menggunakan double linked list sbg implementasi queue
     * - PriorityQueue -> menggunakan array sebagai implementasi queue, namun diurutkan
     * menggunakan Comparable atau Comparator
     */
    public static void main(String[] args) {
        // Queue<String> queue = new ArrayDeque<>(10); // Seperti ArrayList
        Queue<String> queue = new PriorityQueue<>(); //
         // Queue<String> queue = new LinkedList<>();

        queue.add("Eko");
        queue.add("Kurniawan");
        queue.add("Khannedy");

        // Method poll() => Get and remove data paling depan
        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
