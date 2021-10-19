package exception.error;

public class DatabaseApp {
    public static void main(String[] args) {
        // jika terjadi exception.error, connectDatabase akan mematikan aplikasi krn jenis Exception adalah Error
        connectDatabase("Kiky", null);
        System.out.println("Program sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
