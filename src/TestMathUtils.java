public class TestMathUtils {

    public static void main(String[] args) {
        // Normal test cases
        System.out.println("\n=================================");
        System.out.println("Normal Test Cases:");
        System.out.println("5 + 3 = " + MathUtils.add(5, 3));          // Expected: 8
        System.out.println("10 - 4 = " + MathUtils.subtract(10, 4));   // Expected: 6
        System.out.println("7 * 5 = " + MathUtils.multiply(7, 5));     // Expected: 35
        System.out.println("5 / 2 = " + MathUtils.divide(5, 2));     // Expected: 2.5

        System.out.println("=================================");
        // Edge test cases
        System.out.println("Edge Test Cases:");
        System.out.println("5 / 0 = " + MathUtils.divide(5, 0));       // Expected: NaN
        System.out.println("0 + 0 = " + MathUtils.add(0, 0));          // Expected: 0
        System.out.println("5 * 0 = " + MathUtils.multiply(5, 0));     // Expected: 0

        System.out.println("=================================");
        System.out.println("Thank you for using the program!");
    }
}