package com.example.sharedcalculator

//A simple calculator class for performing basic arithmetic operations.

public class Calculator {

    /**
     * Adds two numbers and returns the result.
     */
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    /**
     * Subtracts the second number from the first.
     * @return Result of a - b
     */
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    /**
     * Multiplies two numbers.
     * @return Product of a and b
     */
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    /**
     * Divides the first number by the second.
     * @return Quotient of a / b
     * @throws IllegalArgumentException if b is zero
     */
    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero") // Prevent division by zero
        }
        return a / b
    }

    /**
     * @return Square of a (a * b)
     */
    fun square(a: Double, b: Double): Double {
        return a * b
    }
}
