public class TestMathUtils {
    public static void main(String[] args) {
        int num1 = 66;
        int num2 = 11;

        System.out.println("Addition: " + MathUtils.add(num1, num2));

        System.out.println("Subtraction: " + MathUtils.subtract(num1, num2));

        System.out.println("Multiplication: " + MathUtils.multiply(num1, num2));

        System.out.println("Division: " + MathUtils.divide(num1, num2));

        System.out.println("Division by zero: " + MathUtils.divide(num1, 0));
    }
}

