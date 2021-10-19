package software.developer.generic.application;

import software.developer.generic.MyData;

public class InvariantApp {
    // Invariant -> tidak boleh disubtitusi dengan subtype(child) atau supertype(parent)
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Kiky");
        // ERROR -> can't subtitute to subtype
        // doIt(stringMyData); // ERROR -> generic method
        // MyData<Object> objectMyData = stringMyData; // ERROR -> generic class

        // ERROR -> can't subtitute to supertype
        MyData<Object> objectMyData = new MyData<>(23031);
        // doItInteger(objectMyData); // ERROR -> generic method
        // MyData<Integer> integerMyData = objectMyData; // ERROR -> generic class
    }

    // Method that required parameter type Object in MyData Class
    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }

    // Method that required parameter type Integer in MyData Class
    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
