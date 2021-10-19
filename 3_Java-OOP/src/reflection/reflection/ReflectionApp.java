package reflection.reflection;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        // ValidationReflection.validationReflection(request); // exception.error -> otomatis sudah dihandle errornya oleh method reflection

        request.setUsername("Muhammadkpn");
        request.setPassword("Muhammadkpn1!");
        request.setName("Muhammadkiky");
        ValidationReflection.validationReflection(request);
    }
}
