package exception.runtime_exception;

// RuntimeException ujung2nya bakal extends jg ke Throwable
public class BlankException extends RuntimeException {
    public BlankException(String message) {
        super(message);
    }
}
