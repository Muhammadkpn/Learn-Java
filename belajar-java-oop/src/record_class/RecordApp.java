package record_class;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("kiky", "123456");

        // getter versi record app
        System.out.println(loginRequest.username()); // result: kiky
        System.out.println(loginRequest.password()); // result: 123456

        // print element di record otomatis tertulis semua isinya tanpa override method toString()
        System.out.println(loginRequest); // result: LoginRequest[username=kiky, password=123456]

        // result -> "Membuat object LoginRequest" selalu diprint karena ia merupakan default dari constructor utama
        System.out.println(new LoginRequest()); // result: LoginRequest[username=kiky, password=null]
        System.out.println(new LoginRequest("Kiky")); // result: LoginRequest[username=kiky, password=null]
        System.out.println(new LoginRequest("Kiky", "Nurdin")); // result: LoginRequest[username=Kiky, password=Nurdin]
    }
}
