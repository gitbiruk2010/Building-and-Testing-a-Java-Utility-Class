# MathUtils - A Java Utility for Basic Mathematical Operations
![image](https://github.com/user-attachments/assets/aba8205f-44e0-428a-b2ff-94e0ce8da9fd)

## Overview
`MathUtils` is a simple Java utility class that provides static methods for performing basic mathematical operations, including addition, subtraction, multiplication, and division. The division method includes error handling to avoid division by zero, returning `Double.NaN` in such cases.

This project is designed to demonstrate:
- The use of static methods in Java.
- Basic arithmetic operations.
- Handling edge cases like division by zero.

---

## Features
The `MathUtils` class includes the following static methods:
1. **Addition**: Adds two integers and returns their sum.
2. **Subtraction**: Subtracts the second integer from the first and returns the result.
3. **Multiplication**: Multiplies two integers and returns their product.
4. **Division**: Divides the first integer by the second and returns the result as a double. If the denominator is zero, it returns `Double.NaN`.

---

## Code Structure
The project consists of two Java classes:
1. **MathUtils.java**: Contains the static methods for mathematical operations.
2. **TestMathUtils.java**: Tests the functionality of the `MathUtils` class with predefined test cases.

---
How to Run the Program

    Prerequisites:

        Ensure you have Java Development Kit (JDK) installed on your system.

        Use an IDE like IntelliJ IDEA or a text editor with a Java compiler.

    Steps:

        Clone or download the project files.

        Open the project in your IDE or text editor.

        Compile and run the TestMathUtils class.

Explanation of Key Concepts

    Static Methods:

        Static methods belong to the class rather than an instance of the class. They can be called directly using the class name (e.g., MathUtils.add(5, 3)).

    Division by Zero:

        Division by zero is mathematically undefined. The divide method handles this by returning Double.NaN (Not a Number) when the denominator is zero.

    Edge Cases:

        Edge cases are scenarios that test the limits of the program's functionality. For example:

            Adding zero to zero.

            Multiplying a number by zero.

            Dividing a number by zero.
