public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Muhammad Kiky", 1);
        sayHello("Ghaaziy Azzam", 2);
    }

    // parameter berguna untuk membuat method yang lebih dinamis
    static void sayHello(String name, int ranking){
        System.out.println(name + " Juara ke-" + ranking);
    }
}
