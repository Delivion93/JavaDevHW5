package com.example.fibonacci.impl;

import com.example.fibonacci.Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP implements Fibonacci {
    private static Map<Integer, Long> memo = new HashMap<>();

    //Time O(n)
    //Memory O(n)
    @Override
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }


}
