package data.recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    // Given a number N return the index value of the Fibonacci sequence,
// where the sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...

// the pattern of the sequence is that each value is the sum of the
// 2 previous values, that means that for N=5 → 2+3

//    Fn = Fn-1 + Fn-2
    //For example: fibonacciRecursive(6) should return 8

    public int fibonacciRecursive(int num) {
        System.out.printf("\n>> Start Num (%d)\n", num);
        if (num < 2) {
            return num;
        }
        int result = fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
        return result;
    }

    public Integer fibonacciIterative(Integer num) {
        List<Integer> acc = new ArrayList<>();
        acc.add(0);
        acc.add(1);

        for (int i = 2; i < num + 1; i++) {
            acc.add(acc.get(i - 2) + acc.get(i - 1));
        }
        return acc.get(num);
    }

    public int fibonacciIterativeOSpace(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num <= 2) {
            return 1;
        }

        // Fn-1
        int numMinus1 = 1;
        // Fn-2
        int numMinus2 = 1;
        // result
        int acc = 0;
        for (int i = 3; i <= num; i++) {
            System.out.printf(">> Num (%d)\tn-2(%d)\tn-1(%d)\n", i, numMinus2, numMinus1);
            acc = numMinus1 + numMinus2;
            // shift up for next number
            // old n-2 == n-1
            numMinus2 = numMinus1;
            // old n-1 current result;
            numMinus1 = acc;
            System.out.printf(">> Acc (%d)\tn-2(%d)\tn-1(%d)\n", acc, numMinus2, numMinus1);

        }

        return acc;
    }


//    public int fibonacciRecursive(int num) {
//        System.out.printf("\n>> Start Num (%d)\n",num);
//        int numMinus2 = num - 2;
//        int numMinus1 = num - 1;
//        System.out.printf(">> Num (%d)\tn-1(%d)\tn-2(%d)\n",num,numMinus1,numMinus2);
//
//        if(num < 2) {
//            System.out.printf("<<   --> (%d)\n",num);
//            return num;
//        }
//
//        return fibonacciRecursive(numMinus1) + fibonacciRecursive(numMinus2) ;
//    }

    public int fibonacciRecursive(int num, int acc) {
        System.out.printf("\n>> Start Num (%d)\n", num);
        int numMinus2 = num - 2;
        int numMinus1 = num - 1;

        System.out.printf(">> Num (%d)\tn-1(%d)\tn-2(%d)\n", num, numMinus1, numMinus2);

        if (num < 2) {
            System.out.printf("<<   --> (%d)\n", num);
            return num;
        }
        int result = fibonacciRecursive(numMinus1) + fibonacciRecursive(numMinus2);
        return fibonacciRecursive(numMinus1, result);
    }
}
