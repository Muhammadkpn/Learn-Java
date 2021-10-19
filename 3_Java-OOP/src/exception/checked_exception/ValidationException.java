package exception.checked_exception;

public class ValidationException extends Throwable {
    public ValidationException(String message) {
        super(message);
    }
}
