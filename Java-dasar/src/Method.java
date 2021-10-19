public class Method {
    // main ada method utama, jika method utama static, maka method lainnya jg harus static
    public static void main(String[] args) {
        sayHelloWorld();
    }

    // method merupakan block code yg reusable, kurang lebih seperti function
    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }
}
