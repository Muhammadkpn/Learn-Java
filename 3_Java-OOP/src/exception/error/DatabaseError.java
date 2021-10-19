package exception.error;

// Jenis exception yg diwajibkan untuk mematikan aplikasi karena kesalahannya cukup serius
public class DatabaseError extends Error {
    public DatabaseError (String message) {
        super(message);
    }
}
