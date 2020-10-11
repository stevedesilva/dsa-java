package data.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {



    @Test
    public void findFactorialIterative_ZeroValue() {

        Factorial factorial = new Factorial();
        int got = factorial.findFactorialIterative(0);
        assertEquals(0,got);
    }

    @Test
    public void findFactorialIterative_OneValue() {

        Factorial factorial = new Factorial();
        int got = factorial.findFactorialIterative(1);
        assertEquals(1,got);

    }

    @Test
    public void findFactorialIterative_2Value() {
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialIterative(2);
        assertEquals(2,got);
    }

    @Test
    public void findFactorialIterative_3Value() {
        // 3 * 2 * 1
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialIterative(3);
        assertEquals(6,got);
    }

    @Test
    public void findFactorialIterative_4Value() {
        // 4 * 3 * 2 * 1
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialIterative(4);
        assertEquals(24,got);
    }

    @Test
    public void findFactorialIterative_5Value() {
        // 5 * 4 * 3 * 2 * 1
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialIterative(5);
        assertEquals(120,got);
    }

    @Test
    public void findFactorialRecursive_ZeroValue() {

        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(0);
        assertEquals(0,got);
    }

    @Test
    public void findFactorialRecursive_OneValue() {

        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(1);
        assertEquals(1,got);

    }

    @Test
    public void findFactorialRecursive_2Value() {
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(2);
        assertEquals(2,got);
    }

    @Test
    public void findFactorialRecursive_3Value() {
        // 3 * 2 * 1
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(3);
        assertEquals(6,got);
    }

    @Test
    public void findFactorialRecursive_4Value() {
        // 4 * 3 * 2 * 1
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(4);
        assertEquals(24,got);
    }

    @Test
    public void findFactorialRecursive_5Value() {
        // 5 * 4 * 3 * 2 * 1
        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(5);
        assertEquals(120,got);
    }

    @Test
    public void findFactorialTailRecursive_ZeroValue() {

        Factorial factorial = new Factorial();
        int got = factorial.findFactorialRecursive(0,1);
        assertEquals(0,got);
    }
//
//    @Test
//    public void findFactorialTailRecursive_OneValue() {
//
//        Factorial factorial = new Factorial();
//        int got = factorial.findFactorialRecursive(1,1);
//        assertEquals(1,got);
//
//    }
//
//    @Test
//    public void findFactorialTailRecursive_2Value() {
//        Factorial factorial = new Factorial();
//        int got = factorial.findFactorialRecursive(2,1);
//        assertEquals(2,got);
//    }
//
//    @Test
//    public void findFactorialTailRecursive_3Value() {
//        // 3 * 2 * 1
//        Factorial factorial = new Factorial();
//        int got = factorial.findFactorialRecursive(3,1);
//        assertEquals(6,got);
//    }
//
//    @Test
//    public void findFactorialTailRecursive_4Value() {
//        // 4 * 3 * 2 * 1
//        Factorial factorial = new Factorial();
//        int got = factorial.findFactorialRecursive(4,1);
//        assertEquals(24,got);
//    }
//
//
//    @Test
//    public void findFactorialTailRecursive_5Value() {
//        // 5 * 4 * 3 * 2 * 1
//        Factorial factorial = new Factorial();
//        int got = factorial.findFactorialRecursive(5,1);
//        assertEquals(120,got);
//    }

}