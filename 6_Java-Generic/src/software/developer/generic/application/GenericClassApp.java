package software.developer.generic.application;

import software.developer.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        // Without generic
        Data dataString = new Data("Without generic");
        dataString.getData();
        String trueResult = (String) dataString.getData();
        System.out.println(trueResult); // result: Without generic
        // ERROR -> Tidak error saat kompilasi, tp akan error saat running krn tipe data di constructor berbeda dengan saat conversi
        // Integer falseResult = (Integer) dataString.getData();

        MyData<String> stringMyData = new MyData<String>("Kiky");
        // MyData<int> intMyData = new MyData<int>(31); // ERROR -> Tipe data tidak boleh primitif
        MyData<Integer> integerMyData = new MyData<>(32);
        MyData<Boolean> booleanMyData = new MyData<>(true);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();
        Boolean booleanValue = booleanMyData.getData();

        System.out.println(stringValue); // result: Kiky
        System.out.println(integerValue); // result: 32
        System.out.println(booleanValue); // result: true
    }
}

// Tipe data generic without class generic
class Data {
    private Object data;

    Data (Object data) {
        this.data = data;
    }

    Object getData() {
        return data;
    }
}
