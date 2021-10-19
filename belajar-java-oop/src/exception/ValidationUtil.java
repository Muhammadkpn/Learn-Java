package exception;

import exception.checked_exception.ValidationException;
import exception.runtime_exception.BlankException;
import record_class.LoginRequest;

public class ValidationUtil {

    // Checked exception -> wajib gunakan try-catch
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    // RuntimeException -> tidak wajib menggunakan jenis throws-nya (BlankException, dll)
    public static void validateRuntime(LoginRequest loginRequest) throws BlankException {
        if (loginRequest.username() == null) {
            // NullPointerException jg extends dari RuntimeException
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }
}
