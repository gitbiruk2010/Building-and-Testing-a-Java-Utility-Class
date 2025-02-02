public class MathUtils {

    // Add
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtract
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiply
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Divide as a double.
    // Returns Double.NaN if division by zero is attempted.
    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }
}