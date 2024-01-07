package com.example.fibonacci.impl;

import com.example.fibonacci.Fibonacci;

public class FibonacciRecursive implements Fibonacci {

    //Time O(2^n)
    //Memory O(2^n)
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciRecursive fb = new FibonacciRecursive();
        System.out.println("fb.fibonacci(5) = " + fb.fibonacci(6));
    }
}