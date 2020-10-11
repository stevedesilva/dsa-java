package data.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    // Given a number N return the index value of the Fibonacci sequence,
// where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...

// the pattern of the sequence is that each value is the sum of the
// 2 previous values, that means that for N=5 → 2+3

    //For example: fibonacciRecursive(6) should return 8

    @Test
    void fibonacciIterative_1() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(0);
        assertEquals(0, got);
    }


    @Test
    void fibonacciIterative_2() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(2);
        assertEquals(1, got);
    }

    @Test
    void fibonacciIterative_3() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(3);
        assertEquals(2, got);
    }

    @Test
    void fibonacciIterative_4() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(4);
        assertEquals(3, got);
    }

    @Test
    void fibonacciIterative_5() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(5);
        assertEquals(5, got);
    }

    @Test
    void fibonacciIterative_6() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(6);
        assertEquals(8, got);
    }

    @Test
    void fibonacciIterative_7() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(7);
        assertEquals(13, got);
    }

    @Test
    void fibonacciIterative_8() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciIterative(8);
        assertEquals(21, got);
    }

    @Test
    void fibonacciRecursive_1() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(0);
        assertEquals(0, got);
    }


    @Test
    void fibonacciRecursive_2() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(1);
        assertEquals(1, got);
    }

    @Test
    void fibonacciRecursive_3() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(3);
        assertEquals(2, got);
    }

    @Test
    void fibonacciIterativeRecursive_4() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(4);
        assertEquals(3, got);
    }

    @Test
    void fibonacciIterativeRecursive_5() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(5);
        assertEquals(5, got);
    }

    @Test
    void fibonacciIterativeRecursive_6() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(6);
        assertEquals(8, got);
    }

    @Test
    void fibonacciIterativeRecursive_7() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(7);
        assertEquals(13, got);
    }

    @Test
    void fibonacciIterativeRecursive_8() {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
        Fibonacci fibonacci = new Fibonacci();
        int got = fibonacci.fibonacciRecursive(8);
        assertEquals(21, got);
    }

//    @Test
//    void fibonacciRecursive_1() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(0,1);
//        assertEquals(0,got);
//    }
//
//
//    @Test
//    void fibonacciRecursive_2() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(1,1);
//        assertEquals(1,got);
//    }
//
//    @Test
//    void fibonacciIterativeRecursive_3() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(3,1);
//        assertEquals(2,got);
//    }
//
//    @Test
//    void fibonacciIterativeRecursive_4() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(4,1);
//        assertEquals(3,got);
//    }
//
//    @Test
//    void fibonacciIterativeRecursive_5() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(5,1);
//        assertEquals(5,got);
//    }
//
//    @Test
//    void fibonacciIterativeRecursive_6() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(6,1);
//        assertEquals(8,got);
//    }
//
//    @Test
//    void fibonacciIterativeRecursive_7() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(7,1);
//        assertEquals(13,got);
//    }
//    @Test
//    void fibonacciIterativeRecursive_8() {
//        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
//        Fibonacci fibonacci = new Fibonacci();
//        int got = fibonacci.fibonacciRecursive(8,1);
//        assertEquals(21,got);
//    }

}