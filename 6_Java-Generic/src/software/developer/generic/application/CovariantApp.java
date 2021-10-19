package software.developer.generic.application;

import software.developer.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Kiky");

    }
    public static void proccess(MyData<? extends Object> myData) {
        // Covariant bersifat read-only. Hanya boleh getData dan tidak boleh setData
        System.out.println(myData.getData());
        // myData.setData(); // ERROR ->
    }
}
