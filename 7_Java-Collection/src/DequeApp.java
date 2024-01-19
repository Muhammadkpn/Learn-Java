import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    /**
     * Deque
     * Singkatan dari double ended queue -> bisa beroperasi dari depan atau belakang
     * - FIFO (First in First Out) -> struktur data antrian. operasi dari depan
     * - LIFO (Last in Last Out) -> stack (tumpukan)
     */
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        // offerFirst -> seperti tumpukan (desc), offerLast -> seperti antrian (asc)
        stack.offerLast("Muhammad");
        stack.offerLast("Kiky");
        stack.offerLast("PN");

        // pollLast -> Seperti ambil sekaligus hapus sesuatu dari tumpukan, ambil dari yg terakhir masuk
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Muhammad");
        queue.offerLast("Kiky");
        queue.offerLast("PN");

        // pollFirst -> Seperti ambil sekaligus hapus sesuatu dari antrian, ambil dari yg pertama masuk
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
