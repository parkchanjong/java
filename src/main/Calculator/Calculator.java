package main.Calculator;

public class Calculator {
    public int add(int i, int j) {
        return i + j;
    }

    int subtract(int i, int j) {
        return i - j;
    }

    int multiply(int i, int j) {
        return i * j;
    }

    int divide(int i, int j) {
        return i / j;
    }
     public static void main(String[] args) {
        Calculator calculator = new Calculator();
         System.out.println(calculator.add(3, 4));
         System.out.println(calculator.subtract(5, 6));
         System.out.println(calculator.multiply(2, 6));
         System.out.println(calculator.divide(8, 4));
     }
}

