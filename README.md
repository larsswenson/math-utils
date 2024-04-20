# MathUtils

This Java program provides a `MathUtils` class with static methods to perform simple mathematical operations. It also includes a `TestMathUtils` class to test the `MathUtils` methods.

## MathUtils Class

`MathUtils` class contains these methods:

- `add(int a, int b)`: Adds two integers and returns their sum.
- `subtract(int a, int b)`: Subtracts the second integer from the first and returns the result.
- `multiply(int a, int b)`: Multiplies two integers and returns their product.
- `divide(int a, int b)`: Divides the first integer by the second integer and returns the quotient as a double. It includes error handling to avoid division by zero, returning `Double.NaN` in such cases.

## TestMathUtils Class

`TestMathUtils` class is used to test the methods of `MathUtils` class. It also includes edge cases, like division by zero.

## Running the Program

(Requires Java Development Kit)

1. Compile source files using the following commands:

    ```bash
    javac MathUtils.java
    javac TestMathUtils.java
    ```

2. After compilation, run `TestMathUtils` with the following command:

    ```bash
    java TestMathUtils
    ```

3. Observe the output of test cases printed to the terminal.
