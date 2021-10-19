package exception;

import exception.checked_exception.ValidationException;
import record_class.LoginRequest;

public class ValidationApp {
    // @Fancy(name = "Method", tags = {"application", "java"}) // Error -> karena elementType tidak appplicable ke method
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "121212");

        // handle exception.error
        try {
            // Isi dari block code ini adalah code yg berpotensi menimbulkan exception.error
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException e) {
            // block akan dieksekusi jika terjadi exception.error
            System.out.println("Error message: " + e.getMessage());
        } finally {
            // Block yg selalu dieksekusi terlepas method tsb exception.error atau tidak
            System.out.println("Selalu dieksekusi");
        }

        // multiple exception in handle exception.error
        // cara 1
        try {
            // Isi dari block code ini adalah code yg berpotensi menimbulkan exception.error
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException e) {
            // block akan dieksekusi jika terjadi exception.error
            System.out.println("Error message: " + e.getMessage());
        } catch (NullPointerException e) {
            // Block akan dieksekusi jika terjadi exception.error null
            System.out.println("Error null: " + e.getMessage());
        }

        // cara 2 -> merger block code in multiple exception
        try {
            // Isi dari block code ini adalah code yg berpotensi menimbulkan exception.error
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e) {
            // block akan dieksekusi jika terjadi exception.error
            System.out.println("Data tidak valid: " + e.getMessage());
        }

        /**
         * validateRuntime -> method extends dari RuntimeException
         * RuntimeException tidak memerlukan trycatch. Namun, saat method yg menggunakan
         * RuntimeException terjadi exception.error, maka program akan terhenti
         *
         * Oleh karena itu, RuntimeException disini digunakan sebagai fungsi lain untuk
         * mengurangi penggunaan trycatch dengan dikumpulkan errornya di satu tempat exception.error handler
         * agar code-nya lebih clean.
         */
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
