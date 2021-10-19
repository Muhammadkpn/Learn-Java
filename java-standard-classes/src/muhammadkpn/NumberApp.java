package muhammadkpn;

public class NumberApp {
    public static void main(String[] args) {
        // non-primitive number merupakan child dari class Number
        // Convert antar non-primitive number
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        System.out.println(shortValue.getClass());

        // convert string to number
        String strNumber1 = "100.100";

        Double number1 = Double.valueOf(strNumber1); // convert string to non-primitive data type
        System.out.println(number1); // result: 100.1

        String strNumber2 = "100A100";

        Double number2 = Double.valueOf(strNumber2);
        System.out.println(number2); // result: error -> string tidak bisa dikonversi ke number
    }
}
