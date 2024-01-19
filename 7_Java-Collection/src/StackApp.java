import java.util.Stack;

public class StackApp {
    /**
     * Stack
     * ● Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out)
     * ● Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque, jadi tidak ada alasan lagi
     * menggunakan class Stack
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Tambah elemen baru ke Stack
        stack.push("Eko");
        stack.push("Kurniawan");
        stack.push("Khannedy");

        // Pop -> mengurangi elemen dari stack by LIFO. Jika stack sudah kosong jd error. Harus dikasih trycatch
        for(var value = stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
        }
    }
}
