package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int z) {
        return z / x;
    }

    public int sumAllOperation(int y, int z) {
        return sum(y) + minus(y) + divide(z) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        System.out.println(sum(10));
        System.out.println(minus(10));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10, 10));
    }
}