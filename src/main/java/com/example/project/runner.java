package com.example.project;

public class runner {
    public static void main(String[] args) {
        Fibonacci fib3 = new Fibonacci(5);
System.out.println(fib3.fibonacciString());

int[] seq3 = fib3.getSequence();
seq3[0] = 100;

System.out.println(fib3.fibonacciString());

        Fibonacci[] fibonaccis = {fib0,fib1,fib2}
        for (Fibonacci fibonacci : fibonaccis) {
            System.out.println(fib.getSequence.length());
        }
    }
}