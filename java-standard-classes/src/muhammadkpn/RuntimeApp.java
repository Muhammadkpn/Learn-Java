package muhammadkpn;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors()); // return total of core in cpu
        System.out.println(runtime.freeMemory()); // return total free memory in JVM
        System.out.println(runtime.totalMemory()); // return total amount of memory in JVM
        System.out.println(runtime.maxMemory()); // return total maximum of memory in JVM
    }
}
