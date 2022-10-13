package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator  {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAndminusdivide(double first, double second) {
        return sum(first, second)
                + minus(first, second)
                + divide(first, second);
    }

    public static double sumAndfour(double first, double second) {
        return sum(first, second)
                + minus(first, second)
                + divide(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета  суммы двух операций из класса MathFunction: разность двух чисел и деление двух чисел равен: " + sumAndminusdivide(10, 20));
        System.out.println("Результат расчета  суммы вычисления всех четырех операций из класса MathFunction равен: " + sumAndfour(10, 20));
    }
}