package inner_class.anonymous;

public class HelloWorldApp {
    public static void main(String[] args) {

        // anonymous class -> class sederhana yg tidak perlu implementasi di file baru. Tidak reusable
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        english.sayHello();
        english.sayHello("Kiky");
    }
}
