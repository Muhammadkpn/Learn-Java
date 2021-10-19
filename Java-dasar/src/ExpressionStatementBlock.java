public class ExpressionStatementBlock {
    public static void main(String[] args) {
        /* Expression */
        int value; // expression
        value = 10; // expression

        System.out.println(value = 100); // Dari "system" ke ";" = statement, value = 100 => expression

        /* Statement */
        // assign statement
        double aValue = 12313.22;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World");
        // object creation statement
        // Date date = new Date();

        /* Block */
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

        {
            System.out.println("Hello World 4");
            System.out.println("Hello World 5");
            System.out.println("Hello World 6");
        }
    }
}
