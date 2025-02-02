# MathUtils - A Java Utility for Basic Mathematical Operations

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